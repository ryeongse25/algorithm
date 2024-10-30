import java.util.Scanner;
import java.util.ArrayList;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        
        ArrayList<Integer> numbers = new ArrayList<>();
        
        for (int i = 1; i <= N; i++) {
            if (N % i == 0) numbers.add(i);
        }
        
        if (numbers.size() < K) System.out.println(0);
        else System.out.println(numbers.get(K - 1));
    }
}