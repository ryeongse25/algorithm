import java.util.Arrays;
import java.util.Scanner;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String num = sc.next();
        
        if (!num.contains("0")) System.out.println(-1);
        else {
            int sum = 0;
            StringBuilder ans = new StringBuilder();
            Character[] arr = new Character[num.length()];
            
            for (int i = 0; i < num.length(); i++) {
                arr[i] = num.charAt(i);
                sum += num.charAt(i) - '0';
            }
            Arrays.sort(arr, Collections.reverseOrder());
            
            for (char c : arr) ans.append(c);
            System.out.println(sum % 3 != 0 ? -1 : ans);
        }
    }
}