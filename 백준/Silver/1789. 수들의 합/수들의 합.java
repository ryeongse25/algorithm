import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        long S = sc.nextLong();
        
        long i = 1;
        long cnt = 0;
        while (S >= i) {
            cnt++;
            S -= i;
            i++;
        }
        
        System.out.println(cnt);
     }
}