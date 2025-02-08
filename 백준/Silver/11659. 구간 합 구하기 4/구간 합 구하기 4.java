import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();
        int M = sc.nextInt();
        
        int[] A = new int[N];
        int[] S = new int[N + 1];
        for (int i = 0; i < N; i++) A[i] = sc.nextInt();
        
        S[1] = A[0];
        for (int i = 2; i <= N; i++) S[i] = S[i - 1] + A[i - 1];
        
        for (int i = 0; i < M; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            System.out.println(S[b] - S[a - 1]);
        }
    }

}