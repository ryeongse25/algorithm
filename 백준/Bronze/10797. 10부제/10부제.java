import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int day = sc.nextInt();
        
        int answer = 0;
        for (int i = 0; i < 5; i++) {
            if (day == sc.nextInt()) answer++;
        }
        System.out.println(answer);
    }
}