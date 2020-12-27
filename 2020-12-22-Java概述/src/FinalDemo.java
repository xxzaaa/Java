public class FinalDemo {
    public static void main(String[] args) {
        final int a = 10;
        //a=20;==>报错
        final int b;
        b = 20;
        //b=30;==>报错
        System.out.println();
    }
}
