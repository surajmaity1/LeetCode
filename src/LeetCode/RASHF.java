package LeetCode;

import java.util.*;

public class RASHF {
    //https://leetcode.com/problems/reduce-array-size-to-the-half/
    public static void main(String[] args) {
        int[] arr = {3,3,3,3,5,5,5,2,2,7};
        System.out.println(minSetSize(arr));
    }

    //Time: O(NlogN)
    //Space: O(N)
    static int minSetSize(int[] arr) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int x : arr)
            map.put(x, map.getOrDefault(x, 0) + 1);

        int n = map.values().size();
        int[] freq = new int[n];
        int index = 0;

        for(int val : map.values()){
            freq[index++] = val;
        }

        Arrays.sort(freq);
        int minSize = 0, halfOfArr = arr.length/2, noOfRemovedElements = 0;
        index = n - 1;
        while(noOfRemovedElements < halfOfArr){
            minSize++;
            noOfRemovedElements += freq[index--];
        }
        return minSize;
    }
}
