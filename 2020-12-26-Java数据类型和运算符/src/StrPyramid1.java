import java.util.Scanner;

public class StrPyramid1 {
    public static void main(String[] args) {
        Scanner sca = new Scanner(System.in);
        String ch = sca.next();

        // 打印第一行
        for (int i = 0; i < 4; i++) {
            System.out.print(" ");
        }
        for (int i = 0; i < 1; i++) {
            System.out.print(ch + " ");
        }
        System.out.println();

        // 打印第二行
        for (int i = 0; i < 3; i++) {
            System.out.print(" ");
        }
        for (int i = 0; i < 2; i++) {
            System.out.print(ch + " ");
        }
        System.out.println();

        // 打印第三行
        for (int i = 0; i < 2; i++) {
            System.out.print(" ");
        }
        for (int i = 0; i < 3; i++) {
            System.out.print(ch + " ");
        }
        System.out.println();

        for (int i = 0; i < 1; i++) {
            System.out.print(" ");
        }
        for (int i = 0; i < 4; i++) {
            System.out.print(ch + " ");
        }
        System.out.println();

        for (int i = 0; i < 0; i++) {
            System.out.print(" ");
        }
        for (int i = 0; i < 5; i++) {
            System.out.print(ch + " ");
        }
        System.out.println();
    }
}
