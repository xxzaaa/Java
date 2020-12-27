import java.util.Scanner;

public class Print1 {
    public static void main(String[] args) {
        Scanner sca = new Scanner(System.in);

        String ch = sca.next();
        int lines = sca.nextInt();
        int d = 1;
        while (d <= lines) {
            for (int i = 0; i < lines - d; i++) {
                System.out.print(" ");
            }
            for (int i = 0; i < d; i++) {
                System.out.print(ch + " ");
            }
            System.out.println();
            d++;
        }
    }
}