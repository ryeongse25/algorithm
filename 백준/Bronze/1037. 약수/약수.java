import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        
        int max = 0;
        int min = 1000000;
        for (int i = 0; i < N; i++) {
            int A = sc.nextInt();
            if (A > max) max = A;
            if (A < min) min = A;
        }
        
        System.out.println(max * min);;
    }
}