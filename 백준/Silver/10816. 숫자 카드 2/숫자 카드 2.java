import java.util.Map;
import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        StringBuilder s = new StringBuilder();
        Map<Integer, Integer> map = new HashMap<>();
        
        int N = sc.nextInt();
        for (int i = 0; i < N; i++) {
            int num = sc.nextInt();
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        
        int M = sc.nextInt();
        for (int i = 0; i < M; i++) {
            s.append(map.getOrDefault(sc.nextInt(), 0) + " ");
        }
        
        System.out.println(s);
    }
}