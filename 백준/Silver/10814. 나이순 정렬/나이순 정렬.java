import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();
        Object[][] members = new Object[N][2];
        
        for (int i = 0; i < N; i++) {
            members[i] = new Object[] {sc.nextInt(), sc.next()};
        }
        
        Arrays.sort(members, (a, b) -> {
            return (Integer) a[0] - (Integer) b[0];
        });
        
        for (Object[] member : members) {
            for (int i = 0; i < 2; i++) System.out.print(member[i] + " ");
            System.out.println();
        }
    }
}