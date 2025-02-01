import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int[][] board = new int[5][5];
        int[][] bingo = new int[5][5];
        
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                board[i][j] = sc.nextInt();
            }
        }
        
        // 번호 하나 부를 때마다 반복
        for (int n = 0; n < 25; n++) {
            int cnt = 0;
            int num = sc.nextInt();

            for (int i = 0; i < 5; i++) {
                for (int j = 0; j < 5; j++) {
                    if (board[i][j] == num) bingo[i][j] = 1;
                }
            }
            
            // 가로 줄 확인
            for (int i = 0; i < 5; i++) {
                boolean flag = true;
                
                for (int j = 0; j < 5; j++) {
                    if (bingo[i][j] == 0) {
                        flag = false;
                        break;
                    }
                }
                
                if (flag) cnt++;
            }
            
            // 세로 줄 확인
            for (int j = 0; j < 5; j++) {
                
                boolean flag = true;
                for (int i = 0; i < 5; i++) {
                    if (bingo[i][j] == 0) {
                        flag = false;
                        break;
                    }
                }
                
                if (flag) cnt++;
            }
            
            // 대각선 확인
            int[][] line1 = new int[][] {{0, 0}, {1, 1}, {2, 2}, {3, 3}, {4, 4}};
            int[][] line2 = new int[][] {{0, 4}, {1, 3}, {2, 2}, {3, 1}, {4, 0}};
            
            boolean flag = true;
            for (int[] xy : line1) {
                if (bingo[xy[0]][xy[1]] == 0) flag = false;
            }
            if (flag) cnt++;
            
            flag = true;
            for (int[] xy : line2) {
                if (bingo[xy[0]][xy[1]] == 0) flag = false;
            }
            if (flag) cnt++;
            
            // 빙고 개수 확인
            if (cnt > 2) {
                System.out.println(n + 1);
                break;
            }
        }
    }
}