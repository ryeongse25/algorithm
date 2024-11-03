import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        
        int i = 1;
        int cnt = 1;
        while (N > 1) {
            N = N - 6 * i;
            i++;
            cnt++;
        }
        
        System.out.println(cnt);
    }
}