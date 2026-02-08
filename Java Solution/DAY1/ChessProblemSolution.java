import java.util.*;

public class ChessProblemSolution {
    public static String determineColor(String s) {
        int col = s.charAt(0) - 'a';
        int row = s.charAt(1) - '1';
        if ((col + row) % 2 == 0) {
            return "White";
        } else {
            return "Black";
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine().trim();
        String result = determineColor(s);
        System.out.println(result);
        scanner.close();
    }

}