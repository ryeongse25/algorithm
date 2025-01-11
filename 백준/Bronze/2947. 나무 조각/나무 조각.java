import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int[] A = new int[5];
        
        for (int i = 0; i < 5; i++) {
            A[i] = sc.nextInt();
        }
        
        while (true) {
            if (A[0] == 1 && A[1] == 2 && A[2] == 3 && A[3] == 4 && A[4] == 5) break;
            
            if (A[0] > A[1]) sorting(0, 1, A);
            if (A[1] > A[2]) sorting(1, 2, A);
            if (A[2] > A[3]) sorting(2, 3, A);
            if (A[3] > A[4]) sorting(3, 4, A);
            
        }
    }
    
    public static void sorting(int n1, int n2, int[] A) {
        int temp = A[n1];
        A[n1] = A[n2];
        A[n2] = temp;
        for (int n : A) System.out.print(n + " ");
        System.out.println();
    }
}