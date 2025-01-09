import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int sum = 0;
        int ans = 0;
        for (int i = 0; i < 10; i++) {
            sum += sc.nextInt();
            if (Math.abs(100 - sum) <= Math.abs(100 - ans)) ans = sum;
        }
        
        System.out.println(ans);
    }
}