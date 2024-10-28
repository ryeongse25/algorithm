import java.util.Scanner;
import java.util.Arrays;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String[] kda = sc.next().split("/");
        int K = Integer.parseInt(kda[0]);
        int D = Integer.parseInt(kda[1]);
        int A = Integer.parseInt(kda[2]);
        
        if (K + A < D || D == 0) System.out.println("hasu");
        else System.out.println("gosu");
    }
}