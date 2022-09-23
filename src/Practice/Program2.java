package Practice;

import java.util.*;

public class Program2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            list.add(sc.nextInt());
        }
        int start = sc.nextInt();
        int end = sc.nextInt();

        for (int i = 0; i < list.size(); i++) {
            int temp = list.get(i);
            if (start <= temp && end >= temp){
                continue;
            }
            list.remove(i);
        }

        System.out.println(list);
    }
}
