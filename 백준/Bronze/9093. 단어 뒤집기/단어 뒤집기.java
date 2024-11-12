import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int T = sc.nextInt();
        sc.nextLine();
        
        for (int i = 0; i < T; i++) {
            String[] arr = sc.nextLine().split(" ");
            
            StringBuilder answer = new StringBuilder();
            for (String s : arr) {
                for (int j = s.length() - 1; j >= 0; j--) answer.append(s.charAt(j));
                answer.append(" ");
            }
            
            System.out.println(answer);
        }
    }
}