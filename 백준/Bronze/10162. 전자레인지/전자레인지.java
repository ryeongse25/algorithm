import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        
        int[] time = {300, 60, 10};
        int[] answer = new int[3];
        
        for (int i = 0; i < 3; i++) {
            answer[i] = T / time[i];
            T -= answer[i] * time[i];
        }
        
        if (T != 0) System.out.println(-1);
        else System.out.println(answer[0] + " " + answer[1] + " " + answer[2]);
    }
}