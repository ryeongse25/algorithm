import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        
        for (int i = 0; i < T; i++) {
            int R = sc.nextInt();
            char[] S = sc.next().toCharArray();
            
            String answer = "";
            for (char c : S) {
                for (int j = 0; j < R; j++) {
                    answer += c;
                }
            }
            
            System.out.println(answer);
        }
    }
}