import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int ans = 0;
        int N = sc.nextInt();
        
        for (int i = 5; i <= N; i++) {
            int num = i;
            while (num % 5 == 0) {
                ans++;
                num /= 5;
            }
        }
        
        System.out.println(ans);
     }
}