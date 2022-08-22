package LeetCode;

public class PT {
    //best
    public boolean isPowerOfTwo1(int n) {
        return n > 0 && (n&(n-1)) == 0 && (n%10 == 1|| n%10 ==2|| n%10 ==4 ||  n%10 ==8 || n%10 == 6);
    }

    public boolean isPowerOfTwo2(int n) {
        return n > 0 && (n & n - 1) == 0;
    }

    //TC: log(n)
    public boolean isPowerOfTwo3(int n) {
        if(n==0){return false;}

        while (n != 1){
            if(n %2 != 0){return false;}
            n /=2;
        }
        return true;
    }

    //Brute-Force
    //Note: it will give TLE
    public boolean isPowerOfFour1(int n) {
        if(n==1){
            return true;
        }

        int i = 2;
        while(i< n){
            i *=2;
        }
        return i == n;
    }
}