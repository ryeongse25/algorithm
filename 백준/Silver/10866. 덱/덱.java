import java.util.Deque;
import java.util.Scanner;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        StringBuilder s = new StringBuilder();
        Deque<Integer> deque = new LinkedList<>();
        
        int N = sc.nextInt();
        for (int i = 0; i < N; i++) {
            String op = sc.next();
            
            if (op.equals("push_back")) deque.addLast(sc.nextInt());
            else if (op.equals("push_front")) deque.addFirst(sc.nextInt());
            else if (op.equals("size")) System.out.println(deque.size());
            else if (op.equals("empty")) System.out.println(deque.isEmpty() ? 1 : 0);
            else if (op.equals("pop_front")) {
                if (deque.isEmpty()) System.out.println(-1); 
                else System.out.println(deque.removeFirst());
            }
            else if (op.equals("pop_back")) {
                if (deque.isEmpty()) System.out.println(-1);
                else System.out.println(deque.removeLast());
            }
            else if (op.equals("front")) {
                if (deque.isEmpty()) System.out.println(-1); 
                else System.out.println(deque.getFirst());
            }
            else {
                if (deque.isEmpty()) System.out.println(-1); 
                else System.out.println(deque.getLast());
            }
        }
    }
}