import java.util.Map;
import java.util.HashMap;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int T = sc.nextInt();
        StringBuilder s = new StringBuilder();
        
        for (int c = 0; c < T; c++) {
            Map<Integer, Integer> map = new HashMap<>();
            
            int N = sc.nextInt();
            for (int i = 0; i < N; i++) map.put(sc.nextInt(), 1);
            
            int M = sc.nextInt();
            for (int i = 0; i < M; i++) s.append(map.containsKey(sc.nextInt()) ? 1 + "\n" : 0 + "\n");
        }
        
        System.out.println(s);
    }
}