package Practice;

import java.util.*;

public class Prog {
    public static void main(String[] args) {
        System.out.println(reverse("hello"));
    }
    static String reverse(String str){

        char[] arr = str.toCharArray();
        int n = arr.length;

        for (int i = 0; i < n/2; i++) {
            char temp = arr[i];
            arr[i] = arr[n-i-1];
            arr[n-i-1] = temp;
        }
        return new String(arr);
    }

}
