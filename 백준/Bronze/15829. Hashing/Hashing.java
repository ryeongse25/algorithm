import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int L = sc.nextInt();
        char[] s = sc.next().toCharArray();
        
        long answer = 0;
        for (int i = 0; i < L; i++) {
            long temp = 1;
            for (int j = 0; j < i; j++) {
                temp = temp * 31 % 1234567891;
            }
            
            answer += ((int)s[i] - 96) * temp;
        }
        
        System.out.println(answer % 1234567891);
    }
}