import java.util.Scanner;
import java.util.Arrays;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        
        for (int i = 0; i < T; i++) {
            int n = sc.nextInt();
            String[] numbers = new String[n];
            
            for (int j = 0; j < n; j++) {
                numbers[j] = sc.next();
            }
            Arrays.sort(numbers);
            
            String answer = "YES";
            for (int j = 1; j < numbers.length; j++) {
                if (numbers[j].startsWith(numbers[j - 1])) answer = "NO";
            }
            System.out.println(answer);
        }
    }
}