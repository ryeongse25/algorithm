public class Main {
    public static void main(String[] args) {
        boolean[] A = new boolean[10001];
        for (int i = 0; i < 10001; i++) A[i] = true;
        
        for (int i = 1; i < 10000; i++) {
            String num = Integer.toString(i);
            
            int sum = i;
            for (int j = 0; j < num.length(); j++) sum += (num.charAt(j) - '0');
            
            if (sum < 10001) A[sum] = false;
        }
        
        for (int i = 1; i < 10001; i++) {
            if (A[i]) System.out.println(i);
        }
    }
}