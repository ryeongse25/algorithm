import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();
        
        for (int i = 0; i < N; i++) {
            String a = sc.next();
            String b = sc.next();
            
            char[] arrA = a.toCharArray();
            char[] arrB = b.toCharArray();
            
            Arrays.sort(arrA);
            Arrays.sort(arrB);
            
            String ans = a + " & " + b;
            
            if (Arrays.equals(arrA, arrB)) ans += " are anagrams.";
            else ans += " are NOT anagrams.";
            
            System.out.println(ans);
        }
    }
}