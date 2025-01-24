import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();
        int M = sc.nextInt();
        String[] board = new String[N];
        
        for (int i = 0; i < N; i++) {
            String line = sc.next();
            board[i] = line;
        }
        
        int max = 0;
        int min = 64;
        for (int i = 0; i < N - 7; i++) {
            for (int j = 0; j < M - 7; j++) {
                
                int cnt = 0;
                for (int u = i; u < i + 8; u++) {
                    for (int v = j; v < j + 8; v++) {
                        if (u % 2 == 0 && v % 2 == 0 || u % 2 != 0 && v % 2 != 0) {
                            if (board[u].charAt(v) != 'W') cnt++;
                        }
                        else {
                            if (board[u].charAt(v) != 'B') cnt++;
                        }
                    }
                }
                
                min = Math.min(min, cnt);
                max = Math.max(max, cnt);
            }
        }
        
        System.out.println(Math.min(min, 64 - max));
    }
}