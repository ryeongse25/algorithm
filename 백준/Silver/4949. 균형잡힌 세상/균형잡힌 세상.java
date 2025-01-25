import java.util.Stack;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            boolean flag = true;
            String s = sc.nextLine();
            Stack<Character> stack = new Stack<>();
            
            if (s.equals(".")) break;
            
            for (char c : s.toCharArray()) {
                if (c == '(' || c == '[') stack.push(c);
                else if (c == ')') {
                    if (!stack.isEmpty() && stack.peek() == '(') stack.pop();
                    else {
                        flag = false;
                        break;
                    }
                } 
                else if (c == ']') {
                    if (!stack.isEmpty() && stack.peek() == '[') stack.pop();
                    else {
                        flag = false;
                        break;
                    }
                }
            }
            
            if (!stack.isEmpty()) flag = false;
            System.out.println(flag ? "yes" : "no");
        }
    }
}