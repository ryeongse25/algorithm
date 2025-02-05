import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int M = 0;
        int sum = 0;
        int N = sc.nextInt();
        
        for (int i = 0; i < N; i++) {
            int num = sc.nextInt();
            sum += num;
            if (num > M) M = num;
        }
        
        System.out.println((double) sum * 100 / M / N);
    }

}