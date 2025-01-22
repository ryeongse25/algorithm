import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int[][] scores = new int[8][2];
        for (int i = 0; i < 8; i++) scores[i] = new int[] {i + 1, sc.nextInt()};
        
        Arrays.sort(scores, (a, b) -> {
           return b[1] - a[1]; 
        });
        
        int sum = 0;
        for (int i = 0; i < 5; i++) sum += scores[i][1];
        System.out.println(sum);
        
        int[] arr = new int[5];
        for (int i = 0; i < 5; i++) arr[i] = scores[i][0];
        
        Arrays.sort(arr);
        for (int r : arr) System.out.print(r + " ");
    }
}