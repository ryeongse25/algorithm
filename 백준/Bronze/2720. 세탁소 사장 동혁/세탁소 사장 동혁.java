import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        
        for (int i = 0; i < T; i++) {
            int C = sc.nextInt();
            
            for (int n: new int[] {25, 10, 5, 1}) {
                System.out.print(C / n + " ");
                C = C % n;
            }
            System.out.println();
        }
    }
}