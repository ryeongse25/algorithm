import java.util.Map;
import java.util.List;
import java.util.HashMap;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();
        List<String> list = new ArrayList<>();
        Map<String, Integer> map = new HashMap<>();
        
        for (int i = 0; i < N; i++) map.put(sc.next(), 1);
        for (int i = 0; i < M; i++) {
            String name = sc.next();
            map.put(name, map.getOrDefault(name, 0) + 1);
        }
        
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            if (entry.getValue() == 2) list.add(entry.getKey());
        }
        
        Collections.sort(list);
        System.out.println(list.size());
        for (String s : list) System.out.println(s);
    }
}