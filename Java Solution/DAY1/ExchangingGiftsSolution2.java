import java.util.Scanner;

public class ExchangingGiftsSolution2 {
    public static void find_youngest_member(int n, int m, int[][] gifts) {
        if(n==1){
            System.out.println(n);
            return;
        }

        int[] in = new int[n + 1];
        int[] out = new int[n + 1];

        for (int i = 0; i < m; i++) {
            int from = gifts[i][0];
            int to = gifts[i][1];

            out[from]++;
            in[to]++;
        }

        for (int i = 1; i <= n; i++) {
            if (in[i] == n - 1 && out[i] == 0) {
                System.out.println(i);
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
