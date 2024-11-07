import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int M = sc.nextInt();
        int N = sc.nextInt();
        
        int sum = 0;
        int min_num = 10000;
        for (int i = M; i <= N; i++) {
            if (Math.sqrt(i) == (int) Math.sqrt(i)) {
                sum += i;
                min_num = Math.min(min_num, i);
            }
        }
        
        if (sum != 0) {
            System.out.println(sum);
            System.out.println(min_num);
        } else System.out.println(-1);
    }
}