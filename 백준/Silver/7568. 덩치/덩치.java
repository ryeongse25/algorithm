import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();
        int[][] men = new int[N][2];
        
        for (int i = 0; i < N; i++) {
            men[i] = new int[] {sc.nextInt(), sc.nextInt()};
        }
        
        for (int i = 0; i < N; i++) {
            int cnt = 0;
            
            for (int j = 0; j < N; j++) {
                if (i == j) continue;
                
                if (men[i][0] < men[j][0] && men[i][1] < men[j][1]) cnt++;
            }
            
            System.out.print(cnt + 1 + " ");
        }
    }
}