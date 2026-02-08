import java.util.*;

public class NonOverlappingIntervalsSolution {

    public static int eraseOverlapIntervals(int[][] intervals) {
        // User will implement this function
        int count = 0, j = 0;
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[1], b[1]));
        for (int i = 1; i < intervals.length; i++){
            if(intervals[i][0] <  intervals[j][1] ){ 
               count++;
            }else{
                j=i;
            }
        }         
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();

        int[][] intervals = new int[N][M];

        for (int i = 0; i < N; i++) {
            intervals[i][0] = sc.nextInt();
            intervals[i][1] = sc.nextInt();
        }

        // Call user logic function and print the output
        int result = eraseOverlapIntervals(intervals);
        System.out.println(result);
        sc.close();
    }
}