import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] s = sc.next().toCharArray();
        
        int height = 10;
        for (int i = 1; i < s.length; i++) {
            if (s[i] == s[i - 1]) height += 5;
            else height += 10;
        }
        
        System.out.println(height);
    }
}