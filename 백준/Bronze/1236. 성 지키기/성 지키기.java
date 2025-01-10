import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();
        int M = sc.nextInt();
        
        int row = 0;
        String[] s = new String[N];
        for (int i = 0; i < N; i++) {
            s[i] = sc.next();
            
            boolean flag = false;
            for (int j = 0; j < M; j++) {
                if (s[i].charAt(j) == 'X') {
                    flag = true;
                    break;
                }
            }
            
            if (!flag) row++;
        }
        
        int col = 0;
        for (int i = 0; i < M; i++) {
            
            boolean flag = false;
            for (int j = 0; j < N; j++) {
                if (s[j].charAt(i) == 'X') flag = true;
            }
            
            if (!flag) col++;
        }

        System.out.println(Math.max(row, col));
    }
}