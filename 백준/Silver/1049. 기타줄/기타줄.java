import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();
        int M = sc.nextInt();
        int[] six_p = new int[M];
        int[] one_p = new int[M];
        
        for (int i = 0; i < M; i++) {
            six_p[i] = sc.nextInt();
            one_p[i] = sc.nextInt();
        }
        
        Arrays.sort(six_p);
        Arrays.sort(one_p);
        
        int ans = 0;
        while (N >= 6) {
            ans += Math.min(six_p[0], one_p[0] * 6);
            N -= 6;
        }
        
        ans += Math.min(six_p[0], one_p[0] * N);
        System.out.println(ans);
    }
}