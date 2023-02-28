package Practice;

public class Program2 {
    public static void main(String[] args) {
        String s = "axe pickaxe";
        System.out.println(s.replaceAll("\\baxe\\b", "sword"));
    }
}
