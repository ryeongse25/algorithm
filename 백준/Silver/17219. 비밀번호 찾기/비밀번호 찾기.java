import java.util.Map;
import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();
        
        Map<String, String> map = new HashMap<>();
        StringBuilder s = new StringBuilder();
        
        for (int i = 0; i < N; i++) map.put(sc.next(), sc.next());
        for (int i = 0; i < M; i++) s.append(map.get(sc.next()) + "\n");
        
        System.out.println(s);
    }
}