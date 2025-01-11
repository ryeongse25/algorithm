import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int T = sc.nextInt();
        for (int i = 0; i < T; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            
            int cnt = 0;
            for (int n = a; n <= b; n++) {
                String num = Integer.toString(n);
                
                for (char c : num.toCharArray()) {
                    if (c == '0') cnt++;
                }
            }
            
            System.out.println(cnt);
        }
    }
}