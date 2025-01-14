import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int cnt = 0;
        int N = sc.nextInt();
        
        for (int i = 0; i < N; i++) {
            boolean flag = true;
            char[] s = sc.next().toCharArray();
            
            for (int j = 0; j < s.length - 1; j++) {
                if (s[j] != s[j + 1] && j + 2 < s.length) {
                    for (int k = j + 2; k < s.length; k++) {
                        if (s[k] == s[j]) {
                            flag = false;
                            break;
                        }
                    }
                }
            }
            
            if (flag) cnt++;
        }
        
        System.out.println(cnt);
    }
}