import java.util.Scanner;
import java.util.Arrays;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        
        for(int i = 0; i < s.length(); i += 10) {
            if (i >= s.length() - 10) {
                System.out.println(s.substring(i));
            } else {
                System.out.println(s.substring(i, i + 10));
            }
        }
    }
}