import java.util.Scanner;

public class 打印菱形 {
    public static void main(String[] args) {
        char ch = '*';

        Scanner sca = new Scanner(System.in);
        while (sca.hasNextInt()) {
            int lines = sca.nextInt();

            int d = 1;
            while (d <= lines) {
                // 打印空格
                for (int i = 0; i < lines - d + 1; i++) {
                    System.out.print(" ");
                }
                for (int i = 0; i < d; i++) {
                    System.out.print(ch + " ");
                }
                System.out.println();
                d++;
            }
            for (int i = 0; i < lines + 1; i++) {
                System.out.print(ch + " ");
            }
            System.out.println();
            int e = 1;
            while (e <= lines) {
                // 打印空格
                for (int i = 0; i < e; i++) {
                    System.out.print(" ");
                }
                // 打印字符
                for (int i = 0; i < lines - e + 1; i++) {
                    System.out.print(ch + " ");
                }
                // 打印换行
                System.out.println();
                e++;
            }
        }
    }
}
