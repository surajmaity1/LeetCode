package Practice;

public class Program2 {
    public static void main(String[] args) {

        char s = 97;
        char e = 122;
        while (e != 'a'){
            System.out.print(s + " " + (int)s + " --- " + (int)e +" " + e);
            System.out.println();
            s++;
            e--;
        }
    }
}
