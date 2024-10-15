import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        
        int answer = 0;
        if (a == b && b == c) answer = 10000 + a * 1000;
        else if (a == b || b == c || a == c) {
            if (a == b || a == c) answer = 1000 + a * 100;
            else answer = 1000 + b * 100;
        }
        else {
            int max = Math.max(a, Math.max(b, c));
            answer = max * 100;
        }
        
        System.out.println(answer);
    }
}