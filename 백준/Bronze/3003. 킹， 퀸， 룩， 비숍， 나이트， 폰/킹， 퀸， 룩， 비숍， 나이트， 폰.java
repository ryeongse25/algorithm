import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A[] = {1, 1, 2, 2, 2, 8};
        for (int i = 0; i < 6; i++) {
            System.out.print(A[i] - sc.nextInt() + " ");
        }
    }
}