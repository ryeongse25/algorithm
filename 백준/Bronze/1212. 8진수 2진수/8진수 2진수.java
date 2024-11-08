import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] num = sc.next().toCharArray();
        
        String[] binary = {"000", "001", "010", "011", "100", "101", "110", "111"};
        
        for (int i = 0; i < num.length; i++) {
            if (i == 0) {
                if (num[i] == '0') System.out.print("0");
                else if (num[i] == '1') System.out.print("1");
                else if (num[i] == '2') System.out.print("10");
                else if (num[i] == '3') System.out.print("11");
                else System.out.print(binary[num[i] - '0']);
            } else System.out.print(binary[num[i] - '0']);
        }
    }
}