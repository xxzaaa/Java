import java.util.Random;
import java.util.Scanner;

public class GuessNumber {
    public static void main(String[] args) {
        Random random=new Random();        //生成随机数
        int r=random.nextInt(100);
        System.out.println("Debug:"+r);

        Scanner scanner=new Scanner(System.in);
        int count=0;
        while(scanner.hasNextInt()){
            int a=scanner.nextInt();
            count++;
            if(a==r){
                System.out.println("恭喜你，猜对了！");
                break;
            }else if(a<r){
                System.out.println("猜小了！");
            }else{
                System.out.println("猜大了！");
            }
            if(count>=3){
                System.out.println("次数用尽，游戏结束！");
                break;
            }
        }

    }
}
