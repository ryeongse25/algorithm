import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        Object[][] students = new Object[n][4];
        
        for (int i = 0; i < n; i++) {
            String name = sc.next();
            int day = sc.nextInt();
            int month = sc.nextInt();
            int year = sc.nextInt();
            
            students[i] = new Object[] {name, day, month, year};
        }
        
        Arrays.sort(students, (a, b) -> {
            if ((int) a[2] == (int) b[2]) return (Integer) a[1] - (Integer) b[1];
            if ((int) a[3] == (int) b[3]) return (Integer) a[2] - (Integer) b[2];
            return (Integer) a[3] - (Integer) b[3];
        });

        System.out.println(students[n - 1][0]);
        System.out.println(students[0][0]);
    }
}