import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        for (int i = 0; i < 3; i++) {
            int zero_cnt = 0;
            String[] s = sc.nextLine().split(" ");
            
            for (int j = 0; j < 4; j++) {
                if (s[j].equals("0")) zero_cnt++;
            }
            
            if (zero_cnt == 0) System.out.println("E");
            else System.out.println((char) (zero_cnt + 64));
        }
    }
}