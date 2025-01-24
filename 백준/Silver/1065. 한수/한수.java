import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int cnt = 0;
        int N = sc.nextInt();
        
        for (int n = 1; n <= N; n++) {
            if (n < 100) cnt++;
            else {
                char[] num = Integer.toString(n).toCharArray();
                
                boolean flag = true;
                int diff = (num[0] - '0') - (num[1] - '0');
                for (int i = 1; i < num.length - 1; i++) {
                    if ((num[i] - '0') - (num[i + 1] - '0') != diff) {
                        flag = false;
                        break;
                    }
                }
                
                if (flag) cnt++;
            }
        }
        
        System.out.println(cnt);
    }
}