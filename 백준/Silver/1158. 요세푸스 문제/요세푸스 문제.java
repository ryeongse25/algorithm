import java.util.Queue;
import java.util.Scanner;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int K = sc.nextInt();
        Queue<Integer> queue = new LinkedList<>();
        for (int i = 1; i <= N; i++) queue.add(i);
        
        System.out.print("<");
        while (queue.size() > 1) {
            for (int i = 1; i < K; i++) {
                int num = queue.poll();
                queue.add(num);
            }
            System.out.print(queue.poll() + ", ");
        }
        System.out.print(queue.poll());
        System.out.print(">");
    }
}