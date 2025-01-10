import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int[] T = new int[45];
        for (int i = 1; i < 45; i++) {
            T[i] = i * (i + 1) / 2;
        }
        
        int N = sc.nextInt();
        for (int c = 0; c < N; c++) {
            int num = sc.nextInt();
            
            boolean flag = false;
            for (int i = 1; i < 45; i++) {
                for (int j = 1; j < 45; j++) {
                    for (int k = 1; k < 45; k++) {
                        if (T[i] + T[j] + T[k] == num) flag = true;
                    }
                }
            }
            
            System.out.println(flag ? 1 : 0);
            
        }
    }
}