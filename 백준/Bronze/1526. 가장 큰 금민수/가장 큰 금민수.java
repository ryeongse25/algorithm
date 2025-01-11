import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        for (int i = n; i > 0; i--) {
            String num = Integer.toString(i);
            
            boolean flag = true;
            for (char c : num.toCharArray()) {
                if (c != '4' && c != '7') flag = false;
            }
            
            if (flag) {
                System.out.println(i);
                break;
            }
        }
    }
}