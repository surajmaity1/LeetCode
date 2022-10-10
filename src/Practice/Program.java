package Practice;

import java.util.*;

public class Program{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        StringBuilder sb = new StringBuilder(str);

        for (int i = 0; i < sb.length()-1; ) {
            if (sb.charAt(i) == 'A' && sb.charAt(i + 1) == 'B') {
                sb.deleteCharAt(i);
                sb.deleteCharAt(i + 1);
                i=0;
            }
            else if (sb.charAt(i) == 'C' && sb.charAt(i + 1) == 'D') {
                sb.deleteCharAt(i);
                sb.deleteCharAt(i + 1);
                i=0;
            }
            else{
                i++;
            }
        }
        System.out.print(sb.length());
    }

}