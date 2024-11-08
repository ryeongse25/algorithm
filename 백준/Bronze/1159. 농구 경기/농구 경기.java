import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();
        int[] arr = new int[26];
        
        for (int i = 0; i < N; i++) {
            String name = sc.next();
            arr[name.charAt(0) - 'a']++;
        }
        
        String answer = "";
        for (int i = 0; i < 26; i++) {
            if (arr[i] >= 5) answer += (char) (i + (int) 'a');
        }
        
        if (answer.equals("")) System.out.println("PREDAJA");
        else System.out.println(answer);
    }
}