import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] numbers = new int[n];

        for (int i = 0; i < n; i++) {
            numbers[i] = Integer.parseInt(br.readLine());
        }
        
        Arrays.sort(numbers);
        int num = (int) Math.round(n * 0.15);
        
        double sum = 0;
        for (int i = num; i < n - num; i++) {
            sum += numbers[i];
        }
        
        System.out.println(Math.round(sum / (n - num * 2)));
    }
}
