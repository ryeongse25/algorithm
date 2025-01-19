import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int cnt = 0;
        char[] S = sc.next().toCharArray();
        for (int i = 0; i < S.length - 1; i++) {
            if (S[i] != S[i + 1]) cnt++;
        }
        
        int ans = cnt / 2;
        if (cnt % 2 != 0) ans++;
     
        System.out.println(ans);
     }
}