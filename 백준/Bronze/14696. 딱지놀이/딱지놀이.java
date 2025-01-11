import java.util.Arrays;
import java.util.Scanner;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int T = sc.nextInt();
        
        for (int c = 0; c < T; c++) {
            int a = sc.nextInt();
            Integer[] A = new Integer[a];
            for (int i = 0; i < a; i++) {
                A[i] = sc.nextInt();
            }
            
            int b = sc.nextInt();
            Integer[] B = new Integer[b];
            for (int i = 0; i < b; i++) {
                B[i] = sc.nextInt();
            }
            
            Arrays.sort(A, Collections.reverseOrder());
            Arrays.sort(B, Collections.reverseOrder());
            
            String winner = "";
            for (int i = 0; i < Math.min(A.length, B.length); i++) {
                if (A[i] > B[i]) {
                    winner = "A";
                    break;
                }
                else if (B[i] > A[i]) {
                    winner = "B";
                    break;
                }
            }
            
            if (winner.equals("")) {
                if (A.length > B.length) winner = "A";
                else if (B.length > A.length) winner = "B";
                else winner = "D";
            }
            
            System.out.println(winner);
        }
    }
}