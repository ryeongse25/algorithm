import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int max = 0;
        int index = 0;
        for (int i = 1; i < 6; i++) {
            String[] score = sc.nextLine().split(" ");
            
            int temp = 0;
            for (String num : score) temp += Integer.parseInt(num);
            
            if (temp > max) {
                max = temp;
                index = i;
            }
        }
        
        System.out.println(index + " " + max);
    }
}