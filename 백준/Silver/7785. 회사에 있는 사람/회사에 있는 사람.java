import java.util.Set;
import java.util.List;
import java.util.HashSet;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();
        Set<String> set = new HashSet<>();
        for (int i = 0; i < N; i++) {
            String name = sc.next();
            String enter = sc.next();
            
            if (enter.equals("enter")) set.add(name);
            else set.remove(name);
        }
        
        List<String> list = new ArrayList<>(set);
        Collections.sort(list, Collections.reverseOrder());
        
        for (String name : list) System.out.println(name);
     }
}