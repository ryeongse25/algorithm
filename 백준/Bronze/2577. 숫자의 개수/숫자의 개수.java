import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        
        int[] answer = new int[10];
        char[] result = Integer.toString(A * B * C).toCharArray();
        
        for (char c : result) {
            answer[c - '0']++;
        }
        
        for (int num : answer) System.out.println(num);
    }
}