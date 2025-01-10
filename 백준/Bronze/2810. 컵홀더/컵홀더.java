import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();
        char[] s = sc.next().toCharArray();
        
        int i = 0;
        int cnt = 1;
        while (i < N) {
            if (s[i] == 'L') i++;
            i++;
            cnt++;
        }
        
        System.out.println(Math.min(N, cnt));
        
    }
}