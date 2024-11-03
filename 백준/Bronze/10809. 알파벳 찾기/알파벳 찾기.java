import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] s = sc.next().toCharArray();
        int[] alphabets = new int[26];
        Arrays.fill(alphabets, -1);
        
        for (int i = 0; i < s.length; i++) {
            if (alphabets[s[i] - 97] == -1) alphabets[s[i] - 97] = i;
        }
        
        for (int num : alphabets) System.out.print(num + " ");
    }
}