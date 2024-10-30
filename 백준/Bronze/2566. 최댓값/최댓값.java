import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int max = -1;
        int row = 0;
        int col = 0;
        for (int i = 1; i < 10; i++) {
            for (int j = 1; j < 10; j++) {
                int num = sc.nextInt();
                if (num > max) {
                    max = num;
                    row = i;
                    col = j;
                }
            }
        }
        
        System.out.println(max);
        System.out.println(row + " " + col);
    }
}