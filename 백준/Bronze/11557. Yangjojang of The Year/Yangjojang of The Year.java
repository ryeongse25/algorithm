import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int T = sc.nextInt();
        for (int i = 0; i < T; i++) {
            int n = sc.nextInt();
            
            int max = 0;
            String ans = "";
            for (int j = 0; j < n; j++) {
                String school = sc.next();
                int alcohol = sc.nextInt();
                
                if (alcohol > max) {
                    ans = school;
                    max = alcohol;
                }
            }
            
            System.out.println(ans);
        }
    }
}