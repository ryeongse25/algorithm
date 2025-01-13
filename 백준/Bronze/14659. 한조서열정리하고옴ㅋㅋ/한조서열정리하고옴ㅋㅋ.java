import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();
        int[] A = new int[N];
        
        for (int i = 0; i < N; i++) A[i] = sc.nextInt();
        
        int ans = 0;
        int cnt = 0;
        int height = A[0];
        
        for (int i = 1; i < N; i++) {
            if (A[i] < height) cnt++;
            else {
                ans = Math.max(ans, cnt);
                height = A[i];
                cnt = 0;
            }
        }
        
        System.out.println(Math.max(ans, cnt));
    }
}