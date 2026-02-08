import java.util.*;

public class BeerProblemSolution2 {
    public static long maxBottleCost(int n, long x, int[] costs) {
        Arrays.sort(costs);

        long[] prefix = new long[n + 1];
        for (int i = 0; i < n; i++) {
            prefix[i + 1] = prefix[i] + costs[i];
        }

        long totalBottles = 0;

        for (int k = 1; k <= n; k++) {
            if (prefix[k] > x) break;

            long maxDays = (x - prefix[k]) / k + 1;
            totalBottles += maxDays ;
        }

        return totalBottles;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x = sc.nextInt();
        int[] costs = new int[n];
        for (int i = 0; i < n; i++) {
            costs[i] = sc.nextInt();
        }
        long result = maxBottleCost(n, x, costs);
        System.out.println(result);
        sc.close();
    }
}
