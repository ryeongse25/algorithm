import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] arr = sc.next().toCharArray();
        
        int time = 0;
        for (char c : arr) {
            if (c == 'A' || c == 'B' || c == 'C') time += 3;
            else if (c == 'D' || c == 'E' || c == 'F') time += 4;
            else if (c == 'G' || c == 'H' || c == 'I') time += 5;
            else if (c == 'J' || c == 'K' || c == 'L') time += 6;
            else if (c == 'M' || c == 'N' || c == 'O') time += 7;
            else if (c == 'P' || c == 'Q' || c == 'R' || c == 'S') time += 8;
            else if (c == 'T' || c == 'U' || c == 'V') time += 9;
            else if (c == 'W' || c == 'X' || c == 'Y' || c == 'Z') time += 10;
        }
        
        System.out.println(time);
    }
}