import java.util.List;
import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();
        int P = sc.nextInt();
        
        int N1 = N;
        List<Integer> list = new ArrayList<>();
        
        while (!list.contains(N1)) {
            list.add(N1);
            N1 = N1 * N % P;
        }
        
        System.out.println(list.size() - list.indexOf(N1));
    }
}