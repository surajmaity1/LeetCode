package Practice;

import java.util.*;

public class Program{
    public static void main(String[] args) {
        int[] arr = {29,6,10};
//        System.out.println(isGoodArray(arr));
        System.out.println(gcd(2,7));
    }
    static boolean isGoodArray(int[] A) {
        int x = A[0], y;
        for (int a: A) {
            x = gcd(a, x);
//            while (a > 0) {
//                y = x % a;
//                x = a;
//                a = y;
//            }
//            System.out.println(x);
        }
        return x == 1;
    }
    static int gcd(int a, int x){
        int y;
        while (a > 0){
            y = x % a;
            x = a;
            a = y;
        }
        return x;
    }

}