import java.util.Scanner;

public class Ascii {
    public static void main(String[] args) {
        Scanner sca = new Scanner(System.in);
        String word = sca.next();
        char ch=word.charAt(0);
        System.out.println((int)ch);
    }
}
