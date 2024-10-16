import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int K = sc.nextInt();
        int N = sc.nextInt();
        int M = sc.nextInt();
        
        if (M < K * N) System.out.println(K * N - M);
        else System.out.println(0);
    }
}