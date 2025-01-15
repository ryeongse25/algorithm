import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();
        int[][] arr = new int[N][2];
        
        for (int i = 0; i < N; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            
            arr[i] = new int[] {x, y};
        }
        
        Arrays.sort(arr, (a, b) -> {
            if (a[0] == b[0]) return a[1] - b[1];
            return a[0] - b[0];
        });
        
        for (int[] pos : arr) {
            for (int x : pos) System.out.print(x + " ");
            System.out.println();
        }
    }
}