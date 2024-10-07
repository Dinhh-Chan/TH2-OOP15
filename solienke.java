import java.util.Scanner;

public  class solienke {
        public static String check(String N) {
        for (int i = 0; i < N.length() - 1; i++) {
            int x = N.charAt(i) - '0';
            int y = N.charAt(i + 1) - '0';
            
            if (Math.abs(x - y) != 1) {
                return "NO";
            }
        }
        return "YES";
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int t = scanner.nextInt();
        
        for (int i = 0; i < t; i++) {
            String N = scanner.next();
            System.out.println(check(N));
        }
        
        scanner.close();
    }
}