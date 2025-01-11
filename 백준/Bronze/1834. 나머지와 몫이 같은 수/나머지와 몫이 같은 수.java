import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        long ans = 0;
        long n = sc.nextInt();
        
        for (int i = 1; i < n; i++) {
            ans += n * i + i;
        }
        
        System.out.println(ans);
        
    }
}