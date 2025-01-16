import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();
        int[][] points = new int[N][2];
        
        for (int i = 0; i < N; i++) {
            points[i] = new int[] {sc.nextInt(), sc.nextInt()};
        }
        
        Arrays.sort(points, (a, b) -> {
            if (a[1] == b[1]) return a[0] - b[0];
            return a[1] - b[1];
        });
        
        for (int[] point : points) {
            for (int x : point) System.out.print(x + " ");
            System.out.println();
        }
    }
}