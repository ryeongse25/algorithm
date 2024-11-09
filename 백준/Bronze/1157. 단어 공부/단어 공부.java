import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] s = sc.next().toUpperCase().toCharArray();
        
        int[] arr = new int[26];
        for (char c : s) arr[c - 'A']++;
        
        int max = 0;
        int max_cnt = 1;
        int max_index = 0;
        for (int i = 0; i < 26; i++) {
            if (arr[i] > max) {
                max_cnt = 1;
                max = arr[i];
                max_index = i;
            } else if (arr[i] == max) max_cnt++;
        }
        
        if (max_cnt > 1) System.out.println("?");
        else System.out.println((char) (max_index + (int) 'A'));
    }
}