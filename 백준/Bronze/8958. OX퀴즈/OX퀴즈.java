import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        
        for (int i = 0; i < T; i++) {
            int sum = 0;
            String[] s = sc.next().split("X");
            
            for (String e : s) {
                for (int j = 0; j < e.length(); j++) {
                    sum += j + 1;
                }
            }
            
            System.out.println(sum);
        }
    }
}