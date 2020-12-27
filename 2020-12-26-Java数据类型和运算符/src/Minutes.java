import java.util.Scanner;

public class Minutes {
    public static void main(String[] args) {
        Scanner sca = new Scanner(System.in);
        int seconds = sca.nextInt();
        int sec = seconds % 60;
        int minutes = seconds / 60;
        int min = minutes % 60;
        int hou = minutes / 60;
        System.out.printf("%d %d %d\n", hou, min, sec);
    }
}
