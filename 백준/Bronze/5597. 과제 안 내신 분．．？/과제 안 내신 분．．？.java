import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A[] = new int[31];
        
        for (int i = 0; i < 28; i++) {
            int n = sc.nextInt();
            A[n]++;
        }
        
        for (int i = 1; i < 31; i++) {
            if (A[i] == 0) System.out.println(i);
        }
    }
}