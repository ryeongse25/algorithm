import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int L = sc.nextInt();
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        int D = sc.nextInt();
        
        int korean = A / C;
        int math = B / D;
        if (A % C != 0) korean++;
        if (B % D != 0) math++;
        System.out.println(L - Math.max(korean, math));
    }
}