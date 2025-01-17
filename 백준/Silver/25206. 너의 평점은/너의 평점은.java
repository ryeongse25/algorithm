import java.util.Map;
import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        Map<String, Double> map = new HashMap<>();
        
        map.put("A+", 4.5);
        map.put("A0", 4.0);
        map.put("B+", 3.5);
        map.put("B0", 3.0);
        map.put("C+", 2.5);
        map.put("C0", 2.0);
        map.put("D+", 1.5);
        map.put("D0", 1.0);
        map.put("F", 0.0);
        
        double total = 0;
        double points = 0;
        for (int i = 0; i < 20; i++) {
            String name = sc.next();
            double point = sc.nextFloat();
            String grade = sc.next();
            
            if (grade.equals("P")) continue;
            
            points += point;
            total += point * map.get(grade);
        }
        
        System.out.printf("%.6f", (total / points));
     }
}