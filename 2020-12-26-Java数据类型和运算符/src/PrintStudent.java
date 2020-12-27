import java.util.Scanner;

public class PrintStudent {
    public static void main(String[] args) {
        String name = "Jack";
        int age = 18;
        String gender = "Man";
        System.out.println("Name    Age    Gender");
        for (int i = 0; i < 21; i++) {
            System.out.print("-");
        }
        System.out.println();
        System.out.printf("%-8s", name);
        System.out.printf("%-7d", age);
        System.out.printf("%s\n", gender);
    }
}
