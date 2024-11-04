import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();
        int M = sc.nextInt();
        sc.nextLine();
        
        String[] numbers = sc.nextLine().split(" ");
        
        int answer = 0;
        for (int i = 0; i < N - 2; i++) {
            for (int j = i + 1; j < N - 1; j++) {
                for (int k = j + 1; k < N; k++) {
                    int a = Integer.parseInt(numbers[i]);
                    int b = Integer.parseInt(numbers[j]);
                    int c = Integer.parseInt(numbers[k]);
                    int temp = a + b + c;
                     
                    if (temp <= M) answer = Math.max(answer, temp);
                }
            }
        }
        
        System.out.println(answer);
    }
}