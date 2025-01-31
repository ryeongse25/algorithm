import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int cnt = 0;
        int N = sc.nextInt();
        int[] trees = new int[N];
        
        trees[0] = sc.nextInt();
        trees[1] = sc.nextInt();
        int temp = trees[1] - trees[0];
        
        for (int i = 2; i < N; i++) {
            trees[i] = sc.nextInt();
            temp = gcd(temp, trees[i] - trees[i - 1]);
        }
        
        System.out.println((trees[N - 1] - trees[0]) / temp + 1 - N);
    }
    
    private static int gcd(int a, int b) {
        if (b == 0) return a;
        return gcd(b, a % b);
    }
}