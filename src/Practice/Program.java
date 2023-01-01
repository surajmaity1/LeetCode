package Practice;

import java.util.*;

public class Program{
    public static void main(String[] args) {
        String pattern = "abba", s = "dog cat cat fish";
        System.out.println(wordPattern(pattern, s));
    }
    static boolean wordPattern(String pattern, String str) {
        String[] words = str.split(" ");
        if (words.length != pattern.length())
            return false;
        Map index = new HashMap();
        for (Integer i=0; i<words.length; ++i) {
            if (index.put(pattern.charAt(i), i) != index.put(words[i], i))
                return false;
        }
        return true;
    }
}