import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int L = sc.nextInt();
        int P = sc.nextInt();
        
        for (int i = 0; i < 5; i++) {
            System.out.print(sc.nextInt() - L * P + " ");
        }
    }
}