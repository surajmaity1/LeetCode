package Practice;

import java.util.*;

public class Program{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Your Number: ");
        int n = sc.nextInt();
        int res = 1;

        for (int i = 1; i <= 10; i++) {
            System.out.print(n + " * " + i + " = " );
            res = n * i;
            System.out.println(res);
        }
    }

}