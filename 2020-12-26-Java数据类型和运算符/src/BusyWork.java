import java.util.Scanner;

public class BusyWork {
    public static void main(String[] args) {
        //1.根据年龄打印：少年，青年，中年，老年
//        Scanner scanner=new Scanner(System.in);
//        if(scanner.hasNext()){
//            int age= scanner.nextInt();
//            if(age<=18){
//                System.out.println("少年！");
//            }else if(age<=28){
//                System.out.println("青年！");
//            }else if(age<=55){
//                System.out.println("中年！");
//            }else{
//                System.out.println("老年！");
//            }
//        }

        //2.判定一个数是否是素数
        //3.打印1-100之间所有的素数
//        //7.计算1/1-1/2+1/3—1/4+1/5...+1/99-1/100
//        double ans=0.0;
//        for(int i=1;i<=100;i++){
//            double x = 1.0/i;
//            if(i%2==0){
//                ans=ans-x;
//            }else{
//                ans=ans+x;
//            }
//        }
//        System.out.println("1/1-1/2+1/3—1/4+1/5...+1/99-1/100="+ans);
//        //8.编写程序数一下1-100的所有整数中出现多少个数字9
//        int count=0;
//        for(int i=1;i<=99;i++){
//            int a=i;
//            while(a!=0){
//                int d=a%10;
//                if(d==9){
//                    count++;
//                }
//                a=a/10;
//            }
//        }
//        System.out.println(count);
        //9.求出0-999之间所有的水仙花数并输出
        for(int i=100;i<=999;i++){
            int a=i;
            int ge=a%10;
            int shi=a/10%10;
            int bai=a/100;
            if(a==ge*ge*ge+shi*shi*shi+bai*bai*bai){
                System.out.print(a+"  ");
            }
        }
    }
}
