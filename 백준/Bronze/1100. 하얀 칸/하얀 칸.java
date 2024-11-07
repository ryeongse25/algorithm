import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int answer = 0;
        for (int i = 0 ; i < 8; i++) {
            char[] horse = sc.next().toCharArray();
            for (int j = 0; j < 8; j++) {
                if (horse[j] == 'F' && (i + j) % 2 == 0) answer++;
            }
        }
        
        System.out.println(answer);
    }
}