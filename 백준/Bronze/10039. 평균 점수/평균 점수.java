import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int sum = 0;
        for (int i = 0; i < 5; i++) {
            int num = sc.nextInt();
            if (num >= 40) sum += num;
            else sum += 40;
        }
        System.out.println(sum / 5);
    }
}