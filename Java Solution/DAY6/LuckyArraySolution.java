import java.util.*;
public class LuckyArraySolution {
    public static List<Integer> modifyArray(int n, List<Integer> arr) {
        // User logic goes here
        List<Integer> result = new ArrayList<>();
        int max = 0;
        for(int x : arr){
            if(max < x){
                max = x;
            }
            result.add(max+x);
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        List<Integer> arr = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            arr.add(scanner.nextInt());
        }
        List<Integer> modifiedArr = modifyArray(n, arr);
        for (int num : modifiedArr) {
            System.out.print(num + " ");
        }
        scanner.close();
    }
}
