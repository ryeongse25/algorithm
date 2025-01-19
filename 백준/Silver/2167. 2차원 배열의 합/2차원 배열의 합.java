import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();
        int M = sc.nextInt();
        int[][] arr = new int[N][M];
        
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                int num = sc.nextInt();
                arr[i][j] = num;
            }
        }
        
        int K = sc.nextInt();
        for (int c = 0; c < K; c++) {
            int i = sc.nextInt();
            int j = sc.nextInt();
            int x = sc.nextInt();
            int y = sc.nextInt();
            
            int sum = 0;
            for (int u = i - 1; u < x; u++) {
                for (int v = j - 1; v < y; v++) {
                    sum += arr[u][v];   
                }
            }
            
            System.out.println(sum);
        }
     }
}