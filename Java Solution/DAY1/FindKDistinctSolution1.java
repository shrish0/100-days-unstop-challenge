import java.util.*;
public class FindKDistinctSolution1 {

    public static void findKDistinctString(String[] arr, int k){
        HashSet<String> unique = new HashSet<>();
        HashSet<String> parsed = new HashSet<>();

        for (String s : arr) {
            if (!parsed.add(s)) {
                unique.remove(s);
            } else {
                unique.add(s);
            }
        }

        int distinctCount = unique.size();
        if (distinctCount < k){
            System.out.println(-1);
            return ;
        }

        for( String s : arr){
            if(unique.contains(s)){
                k--;
            }
            if(k == 0){
                System.out.println(s);
                return ;
            }
        }

        System.out.println(-1);
        return;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        sc.nextLine(); // consume leftover newline

        String[] arr = new String[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextLine();
        }

        int k = sc.nextInt();
        findKDistinctString(arr, k);
        sc.close();
    }
}
