import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int i = 1;
        while (true) {
            int L = sc.nextInt();
            int P = sc.nextInt();
            int V = sc.nextInt();
            
            if (L == 0 && P == 0 && V == 0) break;
            
            System.out.println("Case " + i + ": " + ((V / P * L) + Math.min(L, V % P)));
            i++;
        }
    }
}