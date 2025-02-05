import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();
        double[] scores = new double[N];
        
        for (int i = 0; i < N; i++) scores[i] = sc.nextDouble();
        Arrays.sort(scores);
        
        double sum = 0;
        for (int i = 0; i < N; i++) {
            scores[i] = scores[i] / scores[N - 1] * 100;
            sum += scores[i];
        }
        
        System.out.println(sum / N);
    }

}