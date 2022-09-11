package Practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class Program{
    static void setZeroes(int[][] arr) {
        int r = arr.length;
        int c = arr[0].length;

        for(int i = r-1; i > 0; i--){
            for(int j = c -1; j > 0; j--){
                if(arr[i][j] == 0){
                    makeZero(arr, i,j);
                }
            }
        }
    }
    static void makeZero(int[][] arr, int r, int c){

        int row = arr.length;
        int col = arr[0].length;
        for(int i = r; i < row; i++){
            for(int j = c; j< col; j++){
                //if(arr[i][j] == 0) break;
                arr[i][j] = 0;
            }
            //if(arr[i][c] == 0) break;
        }
    }

    public int numberOfWeakCharacters(int[][] properties) {
        int count = 0;
        HashMap<Integer, Integer> groups = new HashMap<>();
        int min_atk = Integer.MAX_VALUE, max_atk = Integer.MIN_VALUE;
        int max_def = -1;
        for(int[] arr : properties){
            min_atk = Math.min(min_atk, arr[0]);
            max_atk = Math.max(max_atk, arr[0]);
            groups.put(arr[0], arr[1]);
        }

        for (int i = max_atk-1; i >= min_atk  ; i--) {
            if(groups.containsKey(i))
                continue;

            for (int j = 0; j < groups.size(); j++) {
                if(groups.get(i) < max_def)
                    count++;

            }
            // TODO: 09-09-2022 convert it from python code java code
            //max_def = Math.max(max_def, Math.max(groups.get(i)));
        }
        return count;
    }
    public static void main(String[] args) {
        int[][] a = {
                {0,1,2,0},
                {3,4,5,2},
                {1,3,1,5}
        };
        setZeroes(a);
        for(int[] arr : a)
            System.out.println(Arrays.toString(arr));
    }


}