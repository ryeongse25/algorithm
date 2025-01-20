import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();
        int M = sc.nextInt();
        int[] A = new int[N];
        int[] B = new int[M];
        
        for (int i = 0; i < N; i++) A[i] = sc.nextInt();
        for (int i = 0; i < M; i++) B[i] = sc.nextInt();
        
        int pointer_A = 0;
        int pointer_B = 0;
        StringBuilder s = new StringBuilder();
        
        while (pointer_A < N && pointer_B < M) {
            if (A[pointer_A] > B[pointer_B]) s.append(B[pointer_B++] + " ");
            else s.append(A[pointer_A++] + " ");
        }
        
        if (pointer_A != N) {
            for (int i = pointer_A; i < N; i++) s.append(A[i] + " ");
        }
        else {
            for (int i = pointer_B; i < M; i++) s.append(B[i] + " ");
        }
        
        System.out.println(s);
     }
}