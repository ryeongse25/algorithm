import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        char[] s = sc.next().toCharArray();
        
        for (int i = 2; i >= 0; i--) {
            System.out.println(Integer.parseInt(s[i] + "") * a);
        }
        String b = new String(s);
        System.out.println(a * Integer.parseInt(b));
    }
}