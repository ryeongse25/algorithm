import java.util.Scanner;
import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Set<Integer> numbers = new HashSet<>();
        
        for (int i = 0; i < 10; i++) {
            int num = sc.nextInt();
            numbers.add(num % 42);
        }

        System.out.println(numbers.size());
    }
}