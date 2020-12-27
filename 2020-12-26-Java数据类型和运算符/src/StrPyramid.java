import java.util.Scanner;

public class StrPyramid {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String ch= scanner.next();
        int d=1;
        while(d<=5){
            for(int i=0;i<5-d;i++){
                System.out.print(" ");
            }
            for(int i=0;i<d;i++){
                System.out.print(ch+ " ");
            }
            System.out.println();
            d++;
        }
    }
}
