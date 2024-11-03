import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        
        int zero_cnt = 0;
        for (int i = 0; i < N; i++) {
            if (sc.nextInt() == 0) zero_cnt++;
        }
        
        if (zero_cnt > N / 2) System.out.println("Junhee is not cute!");
        else System.out.println("Junhee is cute!");
    }
}
