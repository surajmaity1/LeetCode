package Practice;

import java.util.*;

public class Program{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input: ");
        String inp1 = sc.nextLine();
        System.out.print("string to be replaced: ");
        String inp2 = sc.nextLine();

        Map<Character, Integer> map = new HashMap<>();
        int i = 1;

        for (char c = 'a'; c <= 'z'; c++){
            map.put(c,i++);
        }

        if (isSubStr(inp1, inp2) == false){
            return;
        }

        System.out.print("string to be replaced with: ");
        String inp3 = sc.nextLine();

        inp1 = inp1.replaceAll("\\b"+inp2+"\\b", inp3);


        System.out.print("output:  " + inp1);


    }

    static boolean isSubStr(String str, String sub){
        return str.contains(sub);
    }

}