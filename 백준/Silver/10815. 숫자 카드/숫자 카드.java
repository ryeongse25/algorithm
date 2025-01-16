import java.util.Map;
import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();
        Map<Integer, Integer> map = new HashMap<>();
        
        for (int i = 0; i < N; i++) map.put(sc.nextInt(), 1);
        
        int M = sc.nextInt();
        StringBuilder ans = new StringBuilder();
        
        for (int i = 0; i < M; i++) {
            int num = sc.nextInt();
            
            ans.append(map.containsKey(num) ? 1 : 0);
            ans.append(" ");
        }
        
        System.out.println(ans);
     }
}