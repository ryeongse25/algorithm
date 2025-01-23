import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();
        int[] numbers = new int[2000001];
        for (int i = 0; i < N; i++) numbers[sc.nextInt() + 1000000] = 1;
        
        StringBuilder s = new StringBuilder();
        for (int i = 2000000; i > -1; i--) {
            if (numbers[i] == 1) s.append(i - 1000000 + "\n");
        }
        
        System.out.println(s);
    }
}