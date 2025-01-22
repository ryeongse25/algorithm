import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int area = 0;
        int[][] board = new int[100][100];
        
        for (int c = 0; c < 4; c++) {
            int x1 = sc.nextInt();
            int y1 = sc.nextInt();
            int x2 = sc.nextInt();
            int y2 = sc.nextInt();
            
            for (int i = x1; i < x2; i++) {
                for (int j = y1; j < y2; j++) {
                    board[i][j] = 1;
                }
            }
        }
        
        for (int i = 0; i < 100; i++) {
            for (int j = 0; j < 100; j++) {
                if (board[i][j] == 1) area++;
            }
        }
        
        System.out.println(area);
    }
}