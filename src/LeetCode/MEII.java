package LeetCode;

import java.util.*;

public class MEII {
    //https://leetcode.com/problems/majority-element-ii/

    //please complete bit operation as soon as possible
    //bit operation
    public List<Integer> majorityElement3(int[] nums) {
        List<Integer> list = new ArrayList<>();
        int[] bit = new int[32];
        for (int num: nums)
            for (int i=0; i<32; i++)
                if ((num>>(31-i) & 1) == 1)
                    bit[i]++;
        int ret=0;
        for (int i=0; i<32; i++) {
            bit[i]=bit[i]>nums.length/3?1:0;
            ret += bit[i]*(1<<(31-i));
        }
        return list;
    }
    //BRUTE FORCE
    public List<Integer> majorityElement2(int[] nums) {
        List<Integer> list = new ArrayList<>();
        int n = nums.length;

        for(int i = 0; i < n; i++){
            int res = 1;
            for(int j = 0; j < n; j++){
                if(i!=j){
                    if(nums[i] == nums[j]){
                        res++;
                    }
                }
            }

            if(!list.contains(nums[i]) && res > n/3){
                list.add(nums[i]);
            }
        }
        return list;
    }

    //Using Hash-map
    public List<Integer> majorityElement1(int[] nums) {
        List<Integer> list = new ArrayList<>();
        int n = nums.length;
        Map<Integer, Integer> map = new HashMap<>();

        for(int num : nums){
            if(!map.containsKey(num)){
                map.put(num, 1);
            }
            else{
                map.put(num, map.get(num) + 1);
            }

            if(!list.contains(num) && map.get(num) > n/3){
                list.add(num);
            }
        }

        return list;
    }
}
