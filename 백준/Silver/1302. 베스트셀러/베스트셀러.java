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
        Map<String, Integer> map = new HashMap<>();
        List<List<Object>> list = new ArrayList<>();
        
        for (int i = 0; i < N; i++) {
            String book = sc.next();
            map.put(book, map.getOrDefault(book, 0) + 1);
        }
        
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            List<Object> temp = new ArrayList<>();
            temp.add(entry.getKey());
            temp.add(entry.getValue());
            list.add(temp);
        }
        
        Collections.sort(list, (a, b) -> {
            if ((int) a.get(1) == (int) b.get(1)) return ((String) a.get(0)).compareTo((String) b.get(0));
            return (Integer) b.get(1) - (Integer) a.get(1);
        });
        
        System.out.println(list.get(0).get(0));
    }
}