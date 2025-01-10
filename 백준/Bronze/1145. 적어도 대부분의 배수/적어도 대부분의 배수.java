import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int[] A = new int[5];
        for (int i = 0; i < 5; i++) {
            A[i] = sc.nextInt();
        }
        
        Arrays.sort(A);
        
        int ans = A[2];
        while (true) {
            int cnt = 0;
            for (int i = 0; i < 5; i++) {
                if (ans % A[i] == 0) cnt++;
            }
            if (cnt > 2) break;
            ans++;
        }
        
        System.out.println(ans);
    }
}