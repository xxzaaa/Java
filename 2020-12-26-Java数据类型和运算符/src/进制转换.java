import java.util.Scanner;

public class 进制转换 {
    public static void main(String[] args) {
//        Scanner sca = new Scanner(System.in);
//        String hex = sca.next();
        String hex = "ABCDEF";
        int len = hex.length();
        long ans = 0;
        for (int i = 0; i < len; i++) {
            char digitChar = hex.charAt(i);
            // 0-9 A-F
            int digitInt;
            if (digitChar >= '0' && digitChar <= '9') {
                digitInt = digitChar - '0';
            } else {
                digitInt = digitChar - 'A' + 10;
            }
            long p = 1;
            for (int j = 0; j < len - i - 1; j++) {
                p = p * 16;
            }
            long t = digitInt * p;
            ans += t;
        }
        System.out.println(ans);
    }
}
