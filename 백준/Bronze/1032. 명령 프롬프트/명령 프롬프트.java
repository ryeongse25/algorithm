import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();
        String[] s = new String[N];
        
        for (int i = 0; i < N; i++) s[i] = sc.next();
        
        for (int i = 0; i < s[0].length(); i++) {
            boolean flag = true;
            for (int j = 1; j < N; j++) {
                if (s[j].charAt(i) != s[j - 1].charAt(i)) {
                    flag = false;
                    break;
                }
            }
            
            if (flag) System.out.print(s[0].charAt(i));
            else System.out.print("?");
        }
    }
}