import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numbers = new int[5];
        
        int sum = 0;
        for (int i = 0; i < 5; i++) {
            int temp = sc.nextInt();
            sum += temp;
            numbers[i] = temp;
        }
        
        Arrays.sort(numbers);
        
        System.out.println(sum / 5);
        System.out.println(numbers[2]);
    }
}