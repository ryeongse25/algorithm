import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String bin = sc.next();
        
        StringBuilder bin2 = new StringBuilder();
        if (bin.length() % 3 != 0) {
            for (int i = 0; i < 3 - (bin.length() % 3); i++) bin2.append("0");
        }
        bin2.append(bin);
        
        int i = 0;
        StringBuilder ans = new StringBuilder();
        while (i < bin2.length()) {
            int temp = 0;
            for (int j = 0; j < 3; j++) {
                temp += (bin2.charAt(i + j) - '0') * Math.pow(2, 2 - ((i + j) % 3));
            }
            ans.append(Integer.toString(temp));
            i += 3;
        }
        
        System.out.println(ans);
    }
}