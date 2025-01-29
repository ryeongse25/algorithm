import java.util.Stack;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int cnt = 0;
        int N = sc.nextInt();
        for (int i = 0; i < N; i++) {
            char[] s = sc.next().toCharArray();
            Stack<Character> stack = new Stack<>();
            
            for (char c : s) {
                if (!stack.isEmpty() && stack.peek() == c) stack.pop();
                else stack.add(c);
            }
            
            if (stack.isEmpty()) cnt++;
        }
        
        System.out.println(cnt);
    }
}