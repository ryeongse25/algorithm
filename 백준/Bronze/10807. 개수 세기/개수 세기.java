import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        
        int A[] = new int[201];
        for (int i = 0; i < N; i++) {
            int index = sc.nextInt();
            A[index+100]++;
        }
        
        int V = sc.nextInt();
        System.out.println(A[V+100]);
        
    }
}