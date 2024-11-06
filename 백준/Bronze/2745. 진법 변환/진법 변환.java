import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        char[] N = sc.next().toCharArray();
        int B = sc.nextInt();
        
        int answer = 0;
        for (int i = 0; i < N.length; i++) {
            if (Character.isDigit(N[i])) answer += (N[i] - '0') * Math.pow(B, N.length - i - 1);
            else answer += ((int) N[i] - 55) * Math.pow(B, N.length - i - 1);
        }
        
        System.out.println(answer);
    }
}