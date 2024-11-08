import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] s = sc.next().split("-");
        
        String answer = "";
        for (String w : s) {
            answer += w.charAt(0);
        }
        
        System.out.println(answer);
    }
}