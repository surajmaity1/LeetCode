package Practice;

import java.util.*;

public class Prog {
    public static void main(String[] args) {
        double d = 30.123456;
        System.out.println(d);
        System.out.println(myPow(2,10));
    }
    static int myPow(int x, int n) {
        int res = x;
        for(int i = 0; i<n-1; i++){
            res *= x;
        }
        return res;
    }

}
