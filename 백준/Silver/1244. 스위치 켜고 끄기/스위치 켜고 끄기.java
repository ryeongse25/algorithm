import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[] switches = new int[N + 1];
        for (int i = 1; i <= N; i++) switches[i] = sc.nextInt();
        
        int M = sc.nextInt();
        for (int i = 0; i < M; i++) {
            int isBoy = sc.nextInt();
            int num = sc.nextInt();
            
            if (isBoy == 1) {
                for (int j = num; j <= N; j++) {
                    if (j % num == 0) {
                        if (switches[j] == 1) switches[j] = 0;
                        else switches[j] = 1;
                    }
                }
            }
            else {
                // 자기자신 바꾸기
                if (switches[num] == 1) switches[num] = 0;
                else switches[num] = 1;
                
                // 양 옆부터 비교
                for (int j = 1; j <= N / 2; j++) {
                    if (num - j > 0 && num + j <= N && switches[num - j] == switches[num + j]) {
                        if (switches[num - j] == 1) switches[num - j] = 0;
                        else switches[num - j] = 1;
                        
                        if (switches[num + j] == 1) switches[num + j] = 0;
                        else switches[num + j] = 1;
                    } else break;
                }
            }
        }
        
        for (int i = 1; i <= N; i++) {
            System.out.print(switches[i] + " ");
            if (i % 20 == 0) System.out.println();
        }
    }
}