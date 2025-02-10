import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int T = sc.nextInt();
        int[][] A = new int[15][15];
        
        for (int i = 0; i < 15; i++) {
            A[i][0] = 1;
            A[0][i] = i + 1;
        }
        
        for (int i = 1; i < 15; i++) {
            for (int j = 1; j < 15; j++) {
                A[i][j] = A[i][j - 1] + A[i - 1][j];
            }
        }
        
        for (int i = 0; i < T; i++) {
            int k = sc.nextInt();
            int n = sc.nextInt();
            
            System.out.println(A[k][n - 1]);
        }
    }
}