import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        
        int num = N;
        int cycle = 0;
        
        while (true) {
            cycle++;
            int sum = N / 10 + N % 10;
            int temp = (N % 10) * 10 + sum % 10;
            if (temp == num) break;
            N = temp;
        }
        
        System.out.println(cycle);
    }
}