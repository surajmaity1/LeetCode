package Practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Program{
    public static void main(String[] args) {
        int[][] a = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };
        for(Integer b : spiralOrder(a)){
            System.out.println(b);
        }
    }

    static List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> ans = new ArrayList<>();

        int row = matrix.length;
        int col = matrix[0].length;

        int rowBeg = 0, rowEnd = row - 1, colBeg = 0, colEnd = col - 1;

        while(rowBeg<=rowEnd && colBeg<= colEnd){

            for(int i = colBeg; i<= colEnd; i++){
                ans.add(matrix[rowBeg][i]);
            }
            rowBeg++;

            for(int i = rowBeg; i <= rowEnd; i++){
                ans.add(matrix[i][colEnd]);
            }
            colEnd--;

            for(int i = colEnd; i >= colBeg; i--){
                ans.add(matrix[rowEnd][i]);
            }
            rowEnd--;

            for(int i = rowEnd; i >= rowBeg; i--){
                ans.add(matrix[i][colBeg]);
            }
            colBeg--;

        }

        return ans;
    }

}