import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        char[] num = sc.next().toCharArray();
        Arrays.sort(num);
        
        for (int i = num.length - 1; i > -1; i--) System.out.print(num[i]);
    }
}