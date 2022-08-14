package Practice;

import java.util.Arrays;

public class Program {
    public static void main(String[] args) {
        int[] arr = {3,0,3,0};
        int max = 0;
        int minIndex = -1;
        int n = arr.length;
        for(int i = 0; i<n; i++){

            if(max < arr[i]){
                max = arr[i];
                minIndex = i;
            }

        }

        System.out.println("max: "+max);
        System.out.println("minIndex: "+minIndex);
    }



    static int edgeScore(int[] edges) {

        int n = edges.length;
        int[] arr = new int[n];

        for(int i = 0; i < n; i++){
            arr[edges[i]] += i;
        }

        System.out.println(Arrays.toString(arr));

        int max = arr[0];
        int minIndex = Integer.MAX_VALUE;
        for(int i = 0; i<n; i++){

            if(max < arr[i]){
                max = arr[i];
                minIndex = Math.min(minIndex, i);
            }
            System.out.println("max: " + max+"\nminindex: " + minIndex);
        }
        return minIndex;
    }

}
