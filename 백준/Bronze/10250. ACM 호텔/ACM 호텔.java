import java.util.Scanner;
import java.util.Arrays;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        
        for (int i = 0; i < T; i++) {
            int H = sc.nextInt();
            int W = sc.nextInt();
            int N = sc.nextInt();
            
            int F = N % H;
            int R = N / H;
            
            if (F == 0) F = H;
            else R++;
            
            if (R < 10) System.out.println(F + "0" + R);
            else System.out.println(F + "" + R);
        }
    }
}