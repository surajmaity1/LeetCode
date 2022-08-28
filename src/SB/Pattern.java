package SB;

import java.util.Scanner;

public class Pattern {


    /*

     *
     * *
     * * *
     * * * *
     * * * * *

     */
    static void pattern1(int n){
        for(int i = 1; i<=n;i++){
            for(int j = 1; j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    /*
    1
    1 2
    1 2 3
    1 2 3 4
    1 2 3 4 5

    */
    static void pattern2(int n){
        for(int i = 1; i<=n;i++){
            for(int j = 1; j<=i;j++){
                System.out.print(j +" ");
            }
            System.out.println();
        }
    }

    /*
    A
    B B
    C C C
    D D D D
    E E E E E

    */
    static void pattern3(int n){
        for(int i = 1; i<=n;i++){
            for(int j = 1; j<=i;j++){
                System.out.print((char)(i+64));
            }
            System.out.println();
        }
    }

    /*

     * * * * *
     * * * *
     * * *
     * *
     *

     */

    static void pattern4(int n){
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n-i+1; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    /*

    1 2 3 4 5
    1 2 3 4
    1 2 3
    1 2
    1

     */

    static void pattern5(int n){
        for(int i = n; i>=1;i--){
            for(int j = 1; j<=i;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }

    /*

             *
           * * *
         * * * * *
       * * * * * * *
     * * * * * * * * *

     */

    static void pattern6(int n){
        for (int i = 1; i <= n; i++) {
            for(int k = 2*n ; k>2*i;k--){
                System.out.print(" ");
            }

            for (int j = 1; j <=2*i-1; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    /*

            1
          2 3 2
        3 4 5 4 3
      4 5 6 7 6 5 4
    5 6 7 8 9 8 7 6 5

     */
    static void pattern7(int n){
        for (int i = 1; i <= n; i++) {
            for(int k = 2*n ; k>2*i;k--){
                System.out.print(" ");
            }

            int temp = 2*i-1;
            int k = i;

            for (int j = 1; j <=2*i-1; j++) {
                if(k<=temp){
                    System.out.print(k++);
                }
                else{
                    System.out.print(k--);
                }

            }
            System.out.println();
        }
    }

    /*

    *
    * *
    * * *
    * * * *
    * * *
    * *
    *

     */

    static void pattern8(int n){
        for (int i = 1; i <=2*n-1; i++) {

        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        pattern8(n);
    }





}
