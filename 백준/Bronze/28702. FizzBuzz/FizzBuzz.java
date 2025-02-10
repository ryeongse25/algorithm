import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int num = 0;
        for (int i = 0; i < 3; i++) {
            String s = sc.next();
            if (isDigit(s)) num = Integer.parseInt(s) + (3 - i);
        }

        if (num % 3 == 0 && num % 5 == 0) System.out.println("FizzBuzz");
        else if (num % 3 == 0) System.out.println("Fizz");
        else if (num % 5 == 0) System.out.println("Buzz");
        else System.out.println(num);
    }
    
    private static boolean isDigit(String s) {
        try {
            Integer.parseInt(s);
            return true;
        }
        catch (Exception e) {
            return false;
        }
    }
}