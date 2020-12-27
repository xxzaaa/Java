import java.util.Scanner;

public class MyScanner {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

//        String next = s.next();  //按空格/回车/\t 分割的一个个的词
//        System.out.println(next);
//        String next1 = s.next();  //按空格/回车/\t 分割的一个个的词
//        System.out.println(next1);

//        String s = s.nextLine();
//        System.out.println(s);
//
//        int i = s.nextInt();
//        System.out.println(i);
        int count = 0;
        while(s.hasNextInt()){
            int world =s.nextInt();
            System.out.println(world);
            count++;
        }
        System.out.println(count);
    }
}
