import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();
        int A = sc.nextInt();
        int B = sc.nextInt();
        
        int ans = 0;
        while (A != B) {
            if (A % 2 != 0) A++;
            if (B % 2 != 0) B++;
            
            ans++;
            A /= 2;
            B /= 2;
        }
        
        System.out.println(ans);
    }
}