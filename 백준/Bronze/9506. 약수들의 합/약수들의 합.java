import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        while (true) {
            int n = sc.nextInt();
            if (n == -1) break;

            int sum = 1;
            List<Integer> numbers = new ArrayList<>();
            numbers.add(1);
            
            for (int i = 2; i < n; i++) {
                if (n % i == 0) {
                    sum += i;
                    numbers.add(i);
                }
            }
            
            System.out.print(n);
            if (sum == n) {
                System.out.print(" = ");
                for (int i = 0; i < numbers.size(); i++) {
                    if (i == numbers.size() - 1) System.out.print(numbers.get(i));
                    else System.out.print(numbers.get(i) + " + ");
                }
            } else System.out.print(" is NOT perfect.");
            System.out.println();
            
        }
    }
}