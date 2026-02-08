import java.util.*;

public class MarryAndFlowerSolution {
    public static void find_flower_indices(int n, int t, int[] arr, int[] result) {
        // Write your logic here.
        int start = 0, end = n-1, sum = 0;
        while(start<end){
            sum = arr[start] + arr[end];
            if(sum == t){
                result[0] = start;
                result[1] = end;
                return;
            }
            if(sum > t){
                end--;
            }else{
                start++;
            }

        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int t = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        int[] result = new int[2];
        find_flower_indices(n, t, arr, result);
        System.out.println(result[0] + " " + result[1]);
        scanner.close();
    }
}