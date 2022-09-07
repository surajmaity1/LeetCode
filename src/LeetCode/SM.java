package LeetCode;

import java.util.ArrayList;
import java.util.List;

public class SM {
    //https://leetcode.com/problems/spiral-matrix/
    public List<Integer> spiralOrder(int[][] arr) {

        List<Integer> ans = new ArrayList<>();

        if(arr == null || arr.length == 0){
            return ans;
        }

        int rowBeg = 0, colBeg = 0;
        int rowEnd = arr.length-1;
        int colEnd = arr[0].length-1;

        while(rowBeg <= rowEnd && colBeg <=colEnd){
            for(int i = colBeg; i<= colEnd; i++){

            }
        }


        return ans;
    }
}
