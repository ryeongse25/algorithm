import java.util.Map;
import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt();
        int B = sc.nextInt();
        Map<Integer, Integer> map = new HashMap<>();
        
        for (int i = 0; i < A; i++) map.put(sc.nextInt(), 1);
        for (int i = 0; i < B; i++) {
            int num = sc.nextInt();
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        
        int cnt = 0;
        for (Integer value : map.values()) if (value == 1) cnt++;
        System.out.println(cnt);
    }
}