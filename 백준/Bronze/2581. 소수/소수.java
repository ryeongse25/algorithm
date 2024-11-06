import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int M = sc.nextInt();
        int N = sc.nextInt();
        
        int sum = 0;
        int min = 10000;
        for (int i = M; i <= N; i++) {
            if (isPrime(i)) {
                if (i < min) min = i;
                sum += i;
            }
        }
        
        if (sum != 0) {
            System.out.println(sum);
            System.out.println(min);
        } else System.out.println(-1);
    }
    
    public static boolean isPrime(int num) {
        if (num == 1) return false;
        for (int i = 2; i < num; i++) {
            if (num % i == 0) return false;
        }
        return true;
    }
}