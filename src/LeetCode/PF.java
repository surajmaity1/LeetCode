package LeetCode;

public class PF {
    //https://leetcode.com/problems/power-of-four/

    //best
    boolean isPowerOfFour3(int n) {
        return n > 0 && (n&(n-1)) == 0 && (n - 1) % 3 == 0;
    }

    //Note: log and exponential are inverse [means opposite]
    //logx(b) =  y.. => b^y = x

    //TC: log(n)
    public boolean isPowerOfFour2(int n) {
        if(n==0){return false;}

        while (n != 1){
            if(n %4 != 0){return false;}
            n /=4;
        }
        return true;
    }

    //Brute-Force
    public boolean isPowerOfFour1(int n) {
        if(n==1){
            return true;
        }

        int i = 4;
        while(i< n){
            i *=4;
        }
        if(i==n){
            return true;
        }
        else{
            return false;
        }
    }
}
