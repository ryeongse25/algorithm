import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] s = sc.next().toCharArray();
        int[] A = new int[26];
        
        for (int i = 0; i < s.length; i++) {
            A[s[i]-97]++;
        }
        
        for (int i = 0; i < A.length; i++) {
            System.out.print(A[i] + " ");
        }
        
    }
}