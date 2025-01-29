import java.util.Stack;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();
        Stack<Integer> stack = new Stack<>();
        StringBuilder s = new StringBuilder();
        
        for (int i = 0; i < N; i++) {
            int op = sc.nextInt();
            
            if (op == 1) stack.add(sc.nextInt());
            else if (op == 2) {
                if (stack.isEmpty()) s.append(-1 + "\n");
                else s.append(stack.pop() + "\n");
            }
            else if (op == 3) s.append(stack.size() + "\n");
            else if (op == 4) s.append(stack.isEmpty() ? 1 + "\n" : 0 + "\n");
            else {
                if (stack.isEmpty()) s.append(-1 + "\n");
                else s.append(stack.peek() + "\n");
            }
        }
        
        System.out.println(s);
    }
}