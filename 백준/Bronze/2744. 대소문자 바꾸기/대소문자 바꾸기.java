import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] s = sc.next().toCharArray();
        
        for (int i = 0; i < s.length; i++) {
            if (s[i] >= 'a') s[i] -= 32;
            else s[i] += 32;
        }
        
        System.out.println(s);
    }
}