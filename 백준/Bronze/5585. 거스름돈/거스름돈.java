import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int M = 1000 - sc.nextInt();
        
        int cnt = 0;
        for (int i : new int[] {500, 100, 50, 10, 5, 1}) {
            cnt += M / i;
            M %= i;
        }
        
        System.out.println(cnt);
    }
}