import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] num1 = sc.next().toCharArray();
        char[] num2 = sc.next().toCharArray();
        
        int sum = 0;
        
        for (int i = 0; i < num1.length; i++) sum += (num1[i] - '0') * (Math.pow(10, i));
        for (int i = 0; i < num2.length; i++) sum += (num2[i] - '0') * (Math.pow(10, i));
        
        String num = Integer.toString(sum);
        StringBuilder ans = new StringBuilder();
        
        for (int i = num.length() - 1; i > -1; i--) ans.append(num.charAt(i));
        
        System.out.println(Integer.parseInt(ans.toString()));
    }
}