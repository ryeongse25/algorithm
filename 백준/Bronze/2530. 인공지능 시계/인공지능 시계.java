import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        int m = sc.nextInt();
        int s = sc.nextInt();
        int t = sc.nextInt();
        
        s += t;
        if (s > 59) {
            m += s / 60;
            s %= 60;
        }
        if (m > 59) {
            h += m / 60;
            m %= 60;
        }
        if (h > 23) h %= 24;
        
        System.out.print(h + " " + m + " " + s);
    }
}