import java.util.Scanner;
import java.util.Arrays;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        
        int[] balls = new int[N + 1];
        for (int u = 0; u < M; u++) {
            int i = sc.nextInt();
            int j = sc.nextInt();
            int k = sc.nextInt();
            
            for (int v = i; v <= j; v++) {
                balls[v] = k;
            }
        }
        
        for (int i = 1; i <= N; i++) {
            System.out.print(balls[i] + " ");
        }
    }
}