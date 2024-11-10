import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();
        int B = sc.nextInt();
        List<Character> list = new ArrayList<>();
        
        while (N != 0) {
            int mod = N % B;
            
            if (mod > 9) list.add((char) (mod + 55));
            else list.add((char) (mod + '0'));
            
            N /= B;
        }
        
        for (int i = list.size() - 1; i >= 0; i--) {
            System.out.print(list.get(i));
        }
    }
}