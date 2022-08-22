package LeetCode;

public class RM {
    //https://leetcode.com/problems/reshape-the-matrix/
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        int row = mat.length;
        int col = mat[0].length;

        if(row*col != r*c){
            return mat;
        }

        int[][] mat2 = new int[r][c];
        int r1 = 0, r2 = 0, c1 = 0, c2 = 0;

        for(int i = 0; i<row; i++){
            if(c2 == c){c2=0;}
            else{
                c2++;
            }
            if(r2 == r){break;}
            else{r2++;}
            for(int j = 0; j<col ;j++){

                mat2[r2][c2] = mat[i][j];
            }
        }
        return mat2;
    }
}
