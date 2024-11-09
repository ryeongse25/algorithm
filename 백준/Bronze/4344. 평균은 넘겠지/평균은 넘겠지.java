import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int C = sc.nextInt();
        
        for (int i = 0; i < C; i++) {
            int sum = 0;
            int N = sc.nextInt();
            int[] scores = new int[N];
            
            for (int j = 0; j < N; j++) {
                scores[j] = sc.nextInt();
                sum += scores[j];
            }
            
            int cnt = 0;
            for (int j : scores) if (j > (double) sum / N) cnt++;
            
            System.out.println(String.format("%.3f", (double) cnt / N * 100) + "%");
        }
        
    }
}