package Practice;

public class Program{
    public static void main(String[] args) {
        int[] arr = {-1,2,-3,55,51,34,5,-4,66,8,63,45};
        System.out.println(SumPrimeIndices(arr));
    }
    static int SumPrimeIndices(int[] arr){
        if(arr == null || arr.length == 0){
            return -1;
        }
        int n = arr.length;
        int sum = 0;
        for (int i = 0; i < n; i++) {
            if(isPrime(i)){
                sum += arr[i];
            }
        }
        return sum;
    }
    static boolean isPrime(int val){
        if(val <= 1){
            return false;
        }
        for (int i = 2; i*i <= val; i++) {
            if(val % i == 0){
                return false;
            }
        }
        return true;
    }
}
