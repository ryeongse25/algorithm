import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        
        int cnt_2 = 0;
        int cnt_5 = n / 5;
        while (true) {
            int m = n - 5 * cnt_5;
            
            if (m % 2 == 0) {
                cnt_2 = m / 2;
                break;
            };
            
            cnt_5--;
        }
        
        if (n == 1 || n == 3) System.out.println(-1);
        else System.out.println(cnt_5 + cnt_2);
    }
}