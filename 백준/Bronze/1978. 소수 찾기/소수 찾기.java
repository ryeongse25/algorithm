import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        
        int answer = 0;
        for (int i = 0; i < N; i++) {
            int num = sc.nextInt();
            if (isPrime(num)) answer++;
        }
        
        System.out.println(answer);
    }
    
    public static boolean isPrime(int num) {
        if (num < 2) return false;
        
        for (int i = 2; i < num; i++) {
            if (num % i == 0) return false;
        }
        
        return true;
    }
}