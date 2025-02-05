import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int sum = 0;
        int N = sc.nextInt();
        char[] num = sc.next().toCharArray();
        
        for (char c : num) sum += c - '0';
        System.out.println(sum);
    }

}