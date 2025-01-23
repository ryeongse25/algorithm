import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();
        
        int ans = -1;
        int num_5 = N / 5;
        while (num_5 > -1) {
            if ((N - 5 * num_5) % 3 == 0) {
                ans = (N - 5 * num_5) / 3;
                break;
            }
            num_5--;
        }
        
        if ((ans) == -1) System.out.println(-1);
        else System.out.println(ans + num_5);
    }
}