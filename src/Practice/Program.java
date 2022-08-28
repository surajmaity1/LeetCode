package Practice;
import java.util.Scanner;
public class Program{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println(gcd(16,28));
    }
    static int gcd(int a, int b){
        if(a==0){return b;}
        if(b==0){return a;}
        return gcd(b%a,a);
    }
}