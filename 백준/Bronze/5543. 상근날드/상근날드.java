import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int min_burger = 2000;
        for (int i = 0; i < 3; i++) {
            int price = sc.nextInt();
            if (price < min_burger) min_burger = price;
        }
        
        int min_drink = 2000;
        for (int i = 0; i < 2; i++) {
            int price = sc.nextInt();
            if (price < min_drink) min_drink = price;
        }
        
        System.out.println(min_burger + min_drink - 50);
    }
}