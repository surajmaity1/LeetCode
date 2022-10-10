package LeetCode;

import java.util.HashMap;
import java.util.Map;

public class TS {
    //https://leetcode.com/problems/two-sum/
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        int n = nums.length;

        for(int i = 0; i<n ; i++){
            if(map.containsKey(target - nums[i])){
                return new int[]{map.get(target-nums[i]), i};
            }
            map.put( nums[i], i);
        }

        return new int[]{-1,-1};
    }
}
