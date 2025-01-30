import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();
        int first = sc.nextInt();
        for (int i = 1; i < N; i++) {
            int n = sc.nextInt();
            System.out.println(first / gcd(first, n) + "/" + n / gcd(first, n));
        }
    }
    
    private static int gcd(int a, int b) {
        if (b == 0) return a;
        return gcd(b, a % b);
    }
}