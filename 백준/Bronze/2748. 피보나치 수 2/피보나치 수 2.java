import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        
        long[] fibonacci = new long[91];
        fibonacci[0] = 0;
        fibonacci[1] = 1;
        
        for (int i = 2; i <= N; i++) {
            fibonacci[i] = fibonacci[i - 2] + fibonacci[i - 1];
        }
        
        System.out.println(fibonacci[N]);
    }
}