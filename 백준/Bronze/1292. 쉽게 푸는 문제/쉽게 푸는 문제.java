import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int A = sc.nextInt();
        int B = sc.nextInt();
        int[] arr = new int[1001];
        
        int i = 0;
        int num = 1;
        while (true) {
            for (int j = 0; j < num; j++) {
                if (i > 1000) break;
                arr[i++] = num;
            }
            num++;
            if (i > 1000) break;
        }
        
        int sum = 0;
        for (int j = A - 1; j < B; j++) sum += arr[j];
        
        System.out.println(sum);
    }
}