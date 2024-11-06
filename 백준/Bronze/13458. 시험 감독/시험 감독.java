import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();
        int[] A = new int[N];
        
        for (int i = 0; i < N; i++) {
            A[i] = sc.nextInt();
        }
    
        int B = sc.nextInt();
        int C = sc.nextInt();
        
        long cnt = N;
        for (int i : A) {
            if (i > B) {
                i -= B;
                if (i % C == 0) cnt += i / C;
                else cnt += i / C + 1;
            }
        }
        
        System.out.println(cnt);
    }
}