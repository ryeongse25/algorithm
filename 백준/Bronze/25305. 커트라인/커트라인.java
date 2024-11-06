import java.util.Scanner;
import java.util.Collections;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        
        List<Integer> students = new ArrayList<>();
        
        for (int i = 0; i < N; i++) {
            students.add(sc.nextInt());
        }
        
        Collections.sort(students, Collections.reverseOrder());
        System.out.println(students.get(K - 1));
    }
}