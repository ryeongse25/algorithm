import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();
        int[] tShirts = new int[6];
        for (int i = 0; i < 6; i++) tShirts[i] = sc.nextInt();
        
        int T = sc.nextInt();
        int P = sc.nextInt();
        
        int cnt = 0;
        for (int t : tShirts) {
            while (t > 0) {
                cnt++;
                t -= T;
            }
        }
        
        System.out.println(cnt);
        System.out.println(N / P + " " + N % P);
    }
}