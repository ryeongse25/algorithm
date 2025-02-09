import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int cnt = 0;
        int N = sc.nextInt();
        int M = sc.nextInt();
        
        int[] A = new int[N];
        for (int i = 0; i < N; i++) A[i] = sc.nextInt();
        Arrays.sort(A);
        
        int l = 0;
        int r = N - 1;
        while (r > l) {
            if (A[l] + A[r] == M) {
                l++;
                r--;
                cnt++;
            }
            else if (A[l] + A[r] > M) r--;
            else l++;
        }
        
        System.out.println(cnt);
    }

}