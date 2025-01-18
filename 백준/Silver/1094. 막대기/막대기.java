import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int cnt = 0;
        int X = sc.nextInt();
        int[] numbers = {64, 32, 16, 8, 4, 2, 1};
        
        for (int i = 0; i < 7; i++) {
            if (X >= numbers[i]) {
                cnt++;
                X -= numbers[i];
            }
            
            if (X == 0) break;
        }
        
        System.out.println(cnt);
     }
}