package DAY6;
import java.util.*;

public class BeerProblemSolution1 {
    public static long maxBottleCost(int n, int x, int[] costs) {
        long bottlePurchasePerDay = 0, maximumBeerBuy = 0;
        Arrays.sort(costs);

        // Day 0
        long currentDailySell = 0;
        for (int cost : costs) {
            if (currentDailySell + cost > x) break;
            currentDailySell += cost;
            bottlePurchasePerDay++;
        }

        maximumBeerBuy = bottlePurchasePerDay;
        int day = 1;

        while (bottlePurchasePerDay > 0) {
            currentDailySell += bottlePurchasePerDay;

            while (currentDailySell > x && bottlePurchasePerDay > 0) {
                currentDailySell -= costs[(int) bottlePurchasePerDay - 1] + day;
                bottlePurchasePerDay--;
            }

            maximumBeerBuy += bottlePurchasePerDay;
            day++;
        }

        return maximumBeerBuy;
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

