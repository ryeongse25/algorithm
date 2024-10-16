import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        while(true) {
            String s = sc.nextLine();
            if (s.equals("END")) break;
            
            char[] arr = s.toCharArray();
            for (int i = arr.length - 1; i >= 0; i--) {
                System.out.print(arr[i]);
            }
            System.out.println();
        }
        
    }
}