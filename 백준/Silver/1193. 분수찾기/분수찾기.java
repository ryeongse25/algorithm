import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int line = 1;
        int X = sc.nextInt();
        
        while (X > line) {
            X -= line;
            line++;
        }

        if (line % 2 == 0) System.out.println(X + "/" + (line - X + 1));
        else System.out.println((line - X + 1) + "/" + X);
    }
}