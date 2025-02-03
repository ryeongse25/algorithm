import java.util.List;
import java.util.ArrayList;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String A = sc.next();
        int P = sc.nextInt();
        
        List<String> list = new ArrayList<>();
        list.add(A);
        
        int temp = 0;
        while (true) {
            for (char c : A.toCharArray()) {
                temp += Math.pow(c - '0', P);
            }
            
            A = Integer.toString(temp);
            
            if (list.contains(A)) break;
            list.add(A);
            temp = 0;
        }
        
        System.out.println(list.indexOf(A));
    }
}