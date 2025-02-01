import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int cnt = 0;
        int N = sc.nextInt();
        int[] scores = new int[N];
        for (int i = 0; i < N; i++) scores[i] = sc.nextInt();
        
        for (int i = N - 2; i > -1; i--) {
            if (scores[i] >= scores[i + 1]) {
                cnt += scores[i] - scores[i + 1] + 1;
                scores[i] = scores[i + 1] - 1;
            }
        }
        
        System.out.println(cnt);
    }
}