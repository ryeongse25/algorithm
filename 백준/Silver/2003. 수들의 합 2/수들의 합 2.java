import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int cnt = 0;
        int N = sc.nextInt();
        int M = sc.nextInt();
        int[] A = new int[N];
        
        for (int i = 0; i < N; i++) A[i] = sc.nextInt();
        
        for (int i = 0; i < N; i++) {
            int sum = 0;
            for (int j = i; j < N; j++) {
                sum += A[j];
                if (sum == M) cnt++;
                else if (sum > M) break;
            }
        }
        
        System.out.println(cnt);
    }
}