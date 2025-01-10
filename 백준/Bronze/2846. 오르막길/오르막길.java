import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int[] A = new int[n];
        for (int i = 0; i < n; i++) {
            A[i] = sc.nextInt();
        }
        
        int ans = 0;
        int now = A[0];
        int start = A[0];
        for (int i = 1; i < n; i++) {
            if (A[i] <= now) {
                ans = Math.max(ans, now - start);
                start = A[i];
            }
            now = A[i];
        }
        ans = Math.max(ans, now - start);
        
        System.out.println(ans);
    }
}