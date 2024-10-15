import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        int m = sc.nextInt();
        int t = sc.nextInt();
        
        m += t;
        h += m / 60;
        m %= 60;
        h %= 24;
        
        System.out.println(h + " " + m);
    }
}