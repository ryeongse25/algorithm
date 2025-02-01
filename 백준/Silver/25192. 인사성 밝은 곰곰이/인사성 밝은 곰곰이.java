import java.util.Map;
import java.util.HashMap;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int cnt = 0;
        int N = sc.nextInt();
        Map<String, Integer> map = new HashMap<>();
        
        for (int i = 0; i < N; i++) {
            String name = sc.next();
            
            if (name.equals("ENTER")) map.clear();
            else if (!map.containsKey(name)) {
                cnt++;
                map.put(name, 0);
            }
        }
        
        System.out.println(cnt);
    }
}