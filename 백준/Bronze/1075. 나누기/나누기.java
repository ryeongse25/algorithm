import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        char[] N = sc.next().toCharArray();
        int F = sc.nextInt();
        
        N[N.length - 2] = '0';
        N[N.length - 1] = '0';
        
        int mod = Integer.parseInt(new String(N)) % F;
        
        if (mod == 0) System.out.println("00");
        else System.out.println(String.format("%02d", F - mod));
    }
}