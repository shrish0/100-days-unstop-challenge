import java.util.*;

public class FindKDistinctSolution2 {

    public static void findKDistinctString(String[] arr, int k) {
        Map<String, Integer> freq = new LinkedHashMap<>();

        // Count frequency while preserving order
        for (String s : arr) {
            freq.put(s, freq.getOrDefault(s, 0) + 1);
        }

        // Find k-th distinct (frequency == 1)
        for (Map.Entry<String, Integer> entry : freq.entrySet()) {
            if (entry.getValue() == 1) {
                k--;
                if (k == 0) {
                    System.out.println(entry.getKey());
                    return;
                }
            }
        }

        System.out.println(-1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        sc.nextLine();

        String[] arr = new String[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextLine();
        }

        int k = sc.nextInt();
        findKDistinctString(arr, k);
        sc.close();
    }
}
