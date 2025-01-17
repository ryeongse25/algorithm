import java.util.Map;
import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        char[] num = sc.next().toCharArray();
        Map<Integer, Integer> map = new HashMap<>();
        
        for (char c : num) {
            int n = c - '0';
            if (n == 9) map.put(6, map.getOrDefault(6, 0) + 1);
            else map.put(n,  map.getOrDefault(n, 0) + 1);
        }
        
        if (map.getOrDefault(6, 0) % 2 == 0) map.put(6, map.getOrDefault(6, 0) / 2);
        else map.put(6, map.getOrDefault(6, 0) / 2 + 1);
        
        int ans = 0;
        for (int i = 0; i < 9; i++) ans = Math.max(ans, map.getOrDefault(i, 0));
        
        System.out.println(ans);
     }
}