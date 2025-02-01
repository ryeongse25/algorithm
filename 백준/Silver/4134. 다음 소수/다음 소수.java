import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int T = sc.nextInt();
        for (int c = 0; c < T; c++) {
            long n = sc.nextLong();
            
            while (true) {
                if (isPrime(n)) break;
                n++;
            }
            
            System.out.println(n);
        }
    }
    
    private static boolean isPrime(long n) {
        if (n == 0 || n == 1) return false;
        for (int i = 2; i <= (int) Math.sqrt(n); i++) {
            if (n % i == 0) return false;
        }
        return true;
    }
}