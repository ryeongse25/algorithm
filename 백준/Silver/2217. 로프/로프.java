import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[] A = new int[N];
        
        for (int i = 0; i < N; i++) A[i] = sc.nextInt();
        Arrays.sort(A);
        
        int max = 0;
        for (int i = 0; i < N; i++) {
            int temp = A[i] * (N - i);
            max = Math.max(max, temp);
        }
        
        System.out.println(max);
    }
}