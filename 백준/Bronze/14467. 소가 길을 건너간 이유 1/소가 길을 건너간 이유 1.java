import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int cnt = 0;
        int[] cow_pos = new int[10];
        for (int i = 0; i < 10; i++) cow_pos[i] = -1;
        
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            int cow = sc.nextInt();
            int pos = sc.nextInt();
            
            if (cow_pos[cow - 1] == -1) cow_pos[cow - 1] = pos;
            else if (cow_pos[cow - 1] != pos) {
                cnt++;
                cow_pos[cow - 1] = pos;
            }
        }
        
        System.out.println(cnt);
    }
}