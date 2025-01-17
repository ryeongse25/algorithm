import java.util.Set;
import java.util.HashSet;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int M = sc.nextInt();
        Set<Integer> set = new HashSet<>();
        StringBuilder ans = new StringBuilder();
        
        for (int i = 0; i < M; i++) {
            String op = sc.next();
            
            if (op.equals("add")) set.add(sc.nextInt());
            else if (op.equals("remove")) set.remove(sc.nextInt());
            else if (op.equals("check")) {
                ans.append(set.contains(sc.nextInt()) ? 1 : 0);
                ans.append("\n");
            }
            else if (op.equals("toggle")) {
                int num = sc.nextInt();
                if (set.contains(num)) set.remove(num);
                else set.add(num);
            }
            else if (op.equals("all")) {
                for (int n = 1; n < 21; n++) set.add(n);
            }
            else set.clear();
        }
        
        System.out.println(ans);
     }
}