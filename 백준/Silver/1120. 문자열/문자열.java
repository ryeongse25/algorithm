import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String A = sc.next();
        String B = sc.next();
        
        int cnt = A.length();
        for (int i = 0; i <= B.length() - A.length(); i++) {
            int temp = 0;
            for (int j = i; j < i + A.length(); j++) {
                if (A.charAt(j - i) != B.charAt(j)) temp++;
            }
            
            cnt = Math.min(cnt, temp);
        }
        
        System.out.println(cnt);
    }
}