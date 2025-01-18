import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int E = sc.nextInt();
        if (E == 15) E = 0;
        
        int S = sc.nextInt();
        if (S == 28) S = 0;
        
        int M = sc.nextInt();
        if (M == 19) M = 0;
        
        int year = 1;
        while (true) {
            if (year % 15 == E && year % 28 == S && year % 19 == M) break;
            year++;
        }
        
        System.out.println(year);
     }
}