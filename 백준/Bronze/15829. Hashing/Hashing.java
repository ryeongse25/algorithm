import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int L = sc.nextInt();
        char[] s = sc.next().toCharArray();
        
        int answer = 0;
        for (int i = 0; i < L; i++) {
            answer += ((int) s[i] - 96) * Math.pow(31, i);
        }
        
        System.out.println(answer % 1234567891);
    }
}