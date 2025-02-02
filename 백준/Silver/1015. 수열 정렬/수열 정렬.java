import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();
        int[] A = new int[N];
        int[] B = new int[1001];
        
        for (int i = 0; i < N; i++) A[i] = sc.nextInt();
        
        for (int i : A) B[i] += 1;
        
        for (int i = 1; i < 1001; i++) B[i] += B[i - 1];
        
        for (int i : A) {
            System.out.print(B[i - 1] + " ");
            B[i - 1] += 1;
        }
    }
}