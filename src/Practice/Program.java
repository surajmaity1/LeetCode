package Practice;

import java.util.Arrays;

public class Program{
    public static void main(String[] args) {
//        int n =24;
//        System.out.println(Integer.toBinaryString(n));
////        int ans = (n &(-n));
//        int ans = (int) (((Math.log10(n & -n)) / Math.log10(2)) + 1);
//        System.out.println(ans);
        System.out.println(Arrays.toString(plusOne(new int[]{9})));

    }
    static int[] plusOne(int[] digits) {
        if(digits == null || digits.length == 0){
            return digits;
        }

        int n = digits.length + 1;
        int[] arr = new int[n];

        int total = 0;

        for(int a : digits){
            total = total * 10 + a;
        }
        total++;

        for(int i = n-1; i >= 0 ; i--){
            arr[i] = total % 10;
            total /= 10;
        }

        return arr;
    }
}