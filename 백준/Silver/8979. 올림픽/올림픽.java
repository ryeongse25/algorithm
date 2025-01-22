import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int rank = 0;
        int N = sc.nextInt();
        int K = sc.nextInt();
        int[][] medals = new int[N + 1][3];
        
        for (int i = 0; i < N; i++) {
            int num = sc.nextInt();
            medals[num] = new int[] {sc.nextInt(), sc.nextInt(), sc.nextInt()};
        }
        
        int gold = medals[K][0];
        int silver = medals[K][1];
        int bronze = medals[K][2];
        
        for (int i = 1; i <= N; i++) {
            if (i == K) continue;
            
            if (gold < medals[i][0]) rank++;
            else if (gold > medals[i][0]) continue;
            else {
                if (silver < medals[i][1]) rank++;
                else if (silver > medals[i][1]) continue;
                else if (bronze < medals[i][2]) rank++;
            }
        }
        
        System.out.println(rank + 1);
    }
}