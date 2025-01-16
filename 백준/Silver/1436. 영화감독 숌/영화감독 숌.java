import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int cnt = 0;
        int num = 666;
        int N = sc.nextInt();
        
        while (true) {
            if (Integer.toString(num).contains("666")) cnt++;
            if (cnt == N) break;
            num++;
            
        }
        
        System.out.println(num);
    }
}