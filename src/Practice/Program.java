package Practice;


import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

//        String text = sc.nextLine();
        String text = "This is my car";
        int len = text.length();

        String result = "";
        String temp = "";

        for(int i = len - 1; i>=0; i--){
            if(text.charAt(i) == ' '){
                result += rev(temp);
                result += " ";
                temp = "";
                continue;
            }
            else if (i == 0){
                temp += text.charAt(i);
                result += rev(temp);
            }
            temp += text.charAt(i);
        }
        System.out.println(result);
    }

    static String rev(String rev){
        if(rev.length() < 2){
            return rev;
        }
        char[] arr = rev.toCharArray();
        int n = arr.length;
        for(int i = 0; i < (n)/2; i++){
            char temp = arr[i];
            arr[i] = arr[n-i-1];
            arr[n-i-1] = temp;
        }
        String result = new String(arr);
        return result;
    }
}
