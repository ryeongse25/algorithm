import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] num = sc.next().toCharArray();
        
        int answer = 0;
        for (int i = 0; i < num.length; i++) {
            if (Character.isDigit(num[i])) {
                answer += (num[i] - '0') * Math.pow(16, num.length - i - 1);
            }
            else {
                answer += ((int) num[i] - 55) * Math.pow(16, num.length - i - 1);
            }
        }
        
        System.out.println(answer);
    }
}