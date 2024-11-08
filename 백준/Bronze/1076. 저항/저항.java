import java.util.Scanner;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String[] arr = {"black", "brown", "red", "orange", "yellow", "green", "blue", "violet", "grey", "white"};
        List<String> list = Arrays.asList(arr);
        
        String answer = "";
        for (int i = 0; i < 2; i++) {
            answer += Integer.toString(list.indexOf(sc.next()));
        }
        
        int cnt = list.indexOf(sc.next());
        for (int i = 0; i < cnt; i++) answer += "0";
        
        System.out.println(Long.parseLong(answer));
    }
}