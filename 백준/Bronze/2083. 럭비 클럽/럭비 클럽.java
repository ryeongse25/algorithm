import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        while (true) {
            String[] p = sc.nextLine().split(" ");
            String name = p[0];
            int age = Integer.parseInt(p[1]);
            int weight = Integer.parseInt(p[2]);
            
            if (name.equals("#")) break;
            if (age > 17 || weight >= 80) System.out.println(p[0] + " Senior");
            else System.out.println(p[0] + " Junior");
        }
    }
}