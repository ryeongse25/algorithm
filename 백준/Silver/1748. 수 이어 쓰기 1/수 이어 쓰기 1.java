import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        
        int i = 1;
        int ans = 0;
        while (N >= i) {
            ans += (Math.min(N, i * 10 - 1) - i + 1) * Integer.toString(i).length();
            i *= 10;
        }
        
        System.out.println(ans);
    }
}