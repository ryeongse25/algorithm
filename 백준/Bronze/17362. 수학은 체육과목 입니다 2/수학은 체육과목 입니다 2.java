import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt() % 8;
        
        if (n == 0) System.out.println(2);
        else if (n < 6) System.out.println(n);
        else System.out.println(10 - n);
    }
}