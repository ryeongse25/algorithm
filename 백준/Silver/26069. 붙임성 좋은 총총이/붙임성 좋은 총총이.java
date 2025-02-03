import java.util.Map;
import java.util.HashMap;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int cnt = 0;
        int N = sc.nextInt();
        
        Map<String, Integer> map = new HashMap<>();
        map.put("ChongChong", 1);
        
        for (int i = 0; i < N; i++) {
            String A = sc.next();
            String B = sc.next();
            
            if (map.getOrDefault(A, 0) == 1 || map.getOrDefault(B, 0) == 1) {
                map.put(A, 1);
                map.put(B, 1);
            }
        }
        
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            if (entry.getValue() == 1) cnt++;
        }
        
        System.out.println(cnt);
    }
}