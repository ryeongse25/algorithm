import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        char[] A = sc.next().toCharArray();
        char[] B = sc.next().toCharArray();
        
        String new_A = "";
        String new_B = "";
        
        for (int i = 2; i > -1; i--) {
            new_A += A[i];
            new_B += B[i];
        }
        
        System.out.println(Math.max(Integer.parseInt(new_A), Integer.parseInt(new_B)));
    }
}