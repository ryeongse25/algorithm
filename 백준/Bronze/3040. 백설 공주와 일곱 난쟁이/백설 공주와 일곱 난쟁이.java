import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numbers = new int[9];
        
        int sum = 0;
        for (int i = 0; i < 9; i++) {
            numbers[i] = sc.nextInt();
            sum += numbers[i];
        }
        
        int num1 = 0;
        int num2 = 0;
        for (int i = 0; i < 8; i++) {
            for (int j = i + 1; j < 9; j++) {
                if (sum - numbers[i] - numbers[j] == 100) {
                    num1 = numbers[i];
                    num2 = numbers[j];
                }
            }
        }
        
        for (int i = 0; i < 9; i++) {
            if (numbers[i] != num1 && numbers[i] != num2) System.out.println(numbers[i]);
        }
    }
}