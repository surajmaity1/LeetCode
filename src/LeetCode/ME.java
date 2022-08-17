package LeetCode;

import java.util.HashMap;
import java.util.Map;

public class ME {
    //https://leetcode.com/problems/majority-element/


    //Using Hash-map
    public int majorityElement(int[] nums) {
        int n = nums.length;
        Map<Integer, Integer> map = new HashMap<>();



        for(int num : nums){
            if(!map.containsKey(num)){
                map.put(num, 1);
            }
            else{
                map.put(num, map.get(num) + 1);
            }

            if(map.get(num) > n/2){
                return num;
            }
        }

        return 0;
    }

    //BRUTE FORCE
    public int majorityElement2(int[] nums) {
        int n = nums.length;
        int ans = 0;

        for(int i = 0; i < n; i++){
            int res = 1;
            for(int j = 0; j < n; j++){
                if(i!=j){
                    if(nums[i] == nums[j]){
                        res++;
                    }
                }
            }

            if(res > n/2){
                ans = i;
            }
        }
        return nums[ans];
    }
}
