import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        
        int answer = 0;
        for (int i = 0; i < N; i++) {
            int sum = i;
            char[] num = Integer.toString(i).toCharArray();
            
            for (char n : num) {
                sum += n - '0';
            }
            
            if (sum == N) {
                answer = i;
                break;
            }
        }
        
        System.out.println(answer);
    }
}