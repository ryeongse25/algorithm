import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = sc.nextInt();
        int diff = sc.nextInt();
        
        if (diff > sum) System.out.println(-1);
        else {
            int s1 = (sum + diff) / 2;
            int s2 = (sum - diff) / 2;
            if (s1 + s2 == sum && s1 - s2 == diff) System.out.println(s1 + " " + s2);
            else System.out.println(-1);
        }
    }
}