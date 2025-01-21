import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int cnt = 0;
        String s1 = sc.nextLine();
        String s2 = sc.nextLine();
        
        while (s1.contains(s2)) {
            cnt++;
            int index = s1.indexOf(s2) + s2.length();
            s1 = s1.substring(index, s1.length());
        }
        
        System.out.println(cnt);
    }
}