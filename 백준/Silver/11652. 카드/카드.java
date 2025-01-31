import java.util.Map;
import java.util.HashMap;

import java.util.List;
import java.util.ArrayList;

import java.util.Scanner;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();
        Map<Long, Long> map = new HashMap<>();
        List<List<Long>> list = new ArrayList<>();
        
        for (int i = 0; i < N; i++) {
            long num = sc.nextLong();
            map.put(num, map.getOrDefault(num, 0L) + 1);
        }
        
        for (Map.Entry<Long, Long> entry : map.entrySet()) {
            List<Long> temp = new ArrayList<>();
            temp.add(entry.getKey());
            temp.add(entry.getValue());
            list.add(temp);
        }
        
        Collections.sort(list, (a, b) -> {
            if (a.get(1).compareTo(b.get(1)) == 0) return a.get(0).compareTo(b.get(0));
            return b.get(1).compareTo(a.get(1));
        });
        
        System.out.println(list.get(0).get(0));
    }
}