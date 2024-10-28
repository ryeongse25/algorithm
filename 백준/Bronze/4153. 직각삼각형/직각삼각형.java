import java.util.Scanner;
import java.util.Arrays;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        while (true) {
            int[] tri = new int[3];
            
            tri[0] = sc.nextInt();
            tri[1] = sc.nextInt();
            tri[2] = sc.nextInt();
            
            if (tri[0] == 0 && tri[1] == 0 && tri[2] == 0) break;
            
            Arrays.sort(tri);
            
            if (tri[0] * tri[0] + tri[1] * tri[1] == tri[2] * tri[2]) System.out.println("right");
            else System.out.println("wrong");
        }
    }
}