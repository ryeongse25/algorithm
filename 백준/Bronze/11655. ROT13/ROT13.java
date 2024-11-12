import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] s = sc.nextLine().toCharArray();
        
        StringBuilder answer = new StringBuilder();
        for (char c : s) {
            if (c >= 'A' && c <= 'Z') {
                c = (char) ((int) c + 13);
                if (c > 'Z') c = (char) ((int) c - 'Z' + 'A' - 1);
            }
            else if (c >= 'a' && c <= 'z') {
                c = (char) ((int) c + 13);
                if (c > 'z') c = (char) ((int) c - 'z' + 'a' - 1);
            }
            
            answer.append(c);
        }
        
        System.out.println(answer);
    }
}