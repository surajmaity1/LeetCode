package Practice;

import java.util.*;

public class Program{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();

        if (k == 0){
            System.out.print(n);
            return;
        }

        k = k % String.valueOf(n).length();

        char[] arr = String.valueOf(n).toCharArray();
        int len = arr.length-1;

        reverse(arr, 0, arr.length-1);
        reverse(arr, 0, len-k);
        reverse(arr,len-k+1, len);

        String ans = new String(arr);
        System.out.println(ans);
    }
    static void reverse(char[] a, int i, int j) {
        while (i < j) {
            char t = a[i];
            a[i++] = a[j];
            a[j--] = t;
        }
    }

}