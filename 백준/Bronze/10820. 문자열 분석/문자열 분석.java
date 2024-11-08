import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        while (sc.hasNext()) {
            int[] answer = {0, 0, 0 , 0};
            char[] s = sc.nextLine().toCharArray();
            
            for (char c : s) {
                if (c >= 'a' && c <= 'z') answer[0]++;
                else if (c >= 'A' && c <= 'Z') answer[1]++;
                else if (c >= '0' && c <= '9') answer[2]++;
                else answer[3]++;
            }
            
            for (int i : answer) {
                System.out.print(i + " ");
            }
            
            System.out.println();
        }
    }
}