import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        
        for (int i = 0; i < T; i++) {
            String s = sc.next();
            
            int cnt = 0;
            int[] result = recursion(s, 0, s.length() - 1, cnt);
            System.out.println(result[0] + " " + result[1]);
        }
    }
    
    public static int[] recursion(String s, int l, int r, int cnt) {
        cnt++;
        if (l >= r) return new int[] {1, cnt};
        else if (s.charAt(l) != s.charAt(r)) return new int[] {0, cnt};
        else return recursion(s, l + 1, r - 1, cnt);
    }
}