import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            char[] s = sc.next().toCharArray();
            
            if (s[0] == '0') break;
            
            String answer = "yes";
            for (int i = 0; i <= s.length / 2; i++) {
                if (s[i] != s[s.length - i - 1]) {
                    answer = "no";
                    break;
                }
            }
            System.out.println(answer);
        }
    }
}