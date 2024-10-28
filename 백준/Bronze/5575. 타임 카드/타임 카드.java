import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 3; i++) {
            int s_h = sc.nextInt();
            int s_m = sc.nextInt();
            int s_s = sc.nextInt();
            int e_h = sc.nextInt();
            int e_m = sc.nextInt();
            int e_s = sc.nextInt();
            
            if (e_s < s_s) {
                e_s += 60;
                e_m -= 1;
            }
            if (e_m < s_m) {
                e_m += 60;
                e_h -= 1;
            }
            
            System.out.println((e_h - s_h) + " " + (e_m - s_m) + " " + (e_s - s_s));
        }
    }
}