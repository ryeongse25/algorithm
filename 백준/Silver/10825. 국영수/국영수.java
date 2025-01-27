import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        Object[][] students = new Object[N][4];
        
        for (int i = 0; i < N; i++) {
            students[i] = new Object[] {sc.next(), sc.nextInt(), sc.nextInt(), sc.nextInt()};
        }
        
        Arrays.sort(students, (a, b) -> {
            if ((int) a[1] != (int) b[1]) return (Integer) b[1] - (Integer) a[1];
            else if ((int) a[2] != (int) b[2]) return (Integer) a[2] - (Integer) b[2];
            else if ((int) a[3] != (int) b[3]) return (Integer) b[3] - (Integer) a[3];
            return ((String) a[0]).compareTo((String) b[0]);
        });
        
        for (Object[] student : students) System.out.println(student[0]);
    }
}