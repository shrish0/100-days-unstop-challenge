import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class ExchangingGiftsSolution1 {
    public static void find_youngest_member(int n, int m, int[][] gifts) {

        if(n==1){
            System.out.println(n);
            return;
        }
        Set<Integer> receivers = new HashSet<>();
        Set<Integer> givers = new HashSet<>();
        Map<Integer, Integer> receiveCount = new HashMap<>();

        for (int i = 0; i < m; i++) {
            int from = gifts[i][0];
            int to = gifts[i][1];

            givers.add(from);
            receivers.add(to);
            receiveCount.put(to, receiveCount.getOrDefault(to, 0) + 1);
        }

        // Candidates = receivers - givers
        for (int candidate : receivers) {
            if (!givers.contains(candidate) &&
                receiveCount.get(candidate) == n - 1) {

                System.out.println(candidate);
                return;
            }
        }

        System.out.println(-1);
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int[][] gifts = new int[m][2];
        for (int i = 0; i < m; i++) {
            gifts[i][0] = scanner.nextInt();
            gifts[i][1] = scanner.nextInt();
        }
        find_youngest_member(n, m, gifts);
        scanner.close();
    }
}
