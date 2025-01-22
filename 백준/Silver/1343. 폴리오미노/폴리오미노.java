import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        char[] s = sc.next().toCharArray();
        StringBuilder ans = new StringBuilder();
        
        int cnt = 0;
        boolean flag = true;
        for (int i = 0; i <= s.length; i++) {
            if (i < s.length && s[i] == 'X') cnt++;
            else {
                while (cnt >= 4) {
                    ans.append("AAAA");
                    cnt -= 4;
                }
                while (cnt >= 2) {
                    ans.append("BB");
                    cnt -= 2;
                }
                if (cnt > 0) flag = false;
            }
            
            if (i < s.length && s[i] == '.') ans.append(".");
        }
        
        if (flag) System.out.println(ans);
        else System.out.println(-1);
    }
}