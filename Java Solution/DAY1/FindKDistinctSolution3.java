import java.util.*;

public class FindKDistinctSolution3 {

    public static void findKDistinctString(String[] arr, int k) {
        Set<String> parsed = new HashSet<>();
        Set<String> unique = new LinkedHashSet<>();

        // Build unique set
        for (String s : arr) {
            if (!parsed.add(s)) {
                unique.remove(s);
            } else {
                unique.add(s);
            }
        }

        if (unique.size() < k) {
            System.out.println(-1);
            return;
        }

        // LinkedHashSet preserves order → no need to scan arr again
        for (String s : unique) {
            k--;
            if (k == 0) {
                System.out.println(s);
                return;
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
