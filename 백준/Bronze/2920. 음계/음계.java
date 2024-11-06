import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        
        int multiple = 1;
        for (int i = 0; i < 7; i++) {
            int temp = sc.nextInt();
            multiple *= (temp - num);
            num = temp;
        }
        
        if (multiple == 1) System.out.println("ascending");
        else if (multiple == -1) System.out.println("descending");
        else System.out.println("mixed");
    }
}