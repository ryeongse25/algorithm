import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int p = 0;
        int max = 0;
        for (int i = 0; i < 4; i++) {
            int off = sc.nextInt();
            int on = sc.nextInt();
            
            p = p - off + on;
            if (p > max) max = p;
        }
        System.out.println(max);
    }
}