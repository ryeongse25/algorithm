import java.util.Stack;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int K = sc.nextInt();
        Stack<Integer> stack = new Stack<>();
        
        for (int i = 0; i < K; i++) {
            int num = sc.nextInt();
            if (num != 0) stack.push(num);
            else stack.pop();
        }
        
        int sum = 0;
        int size = stack.size();
        for (int i = 0; i < size; i++) {
            sum += stack.pop();
        }
        System.out.println(sum);
    }
}