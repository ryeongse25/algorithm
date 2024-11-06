import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        
        int[] basket = new int[N + 1];
        for (int i = 0; i <= N; i++) {
            basket[i] = i;
        }
        
        for (int i = 0; i < M; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            
            int k = 0;
            int[] temp = new int[b - a + 1];
            for (int j = b; j >= a; j--) temp[k++] = basket[j];
            
            k = 0;
            for (int j = a; j <= b; j++) basket[j] = temp[k++];
        }
        
        for (int i = 1; i < basket.length; i++) System.out.print(basket[i] + " ");
    }
}