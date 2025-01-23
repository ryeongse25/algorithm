import java.util.Stack;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();
        for (int i = 0; i < N; i++) {
            char[] s = sc.next().toCharArray();
            Stack<Character> stack = new Stack<>();
            
            boolean flag = true;
            for (char c : s) {
                if (c == '(') stack.push('(');
                else {
                    if (!stack.isEmpty() && stack.peek() == '(') stack.pop();
                    else {
                        flag = false;
                        break;
                    };
                }
            }
            
            if (!stack.isEmpty()) flag = false;
            System.out.println(flag ? "YES" : "NO");
        }
    }
}