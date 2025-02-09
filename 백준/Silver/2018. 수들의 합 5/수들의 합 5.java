import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();
        
        int start = 0;
        int end = 1;
        int cnt = 1;
        int sum = 1;
        
        while (end < N) {
            if (sum > N) {
                start++;
                sum -= start;
            }
            else {
                if (sum == N) cnt++;
                
                end++;
                sum += end;
            }
        }
        
        System.out.println(cnt);
    }

}