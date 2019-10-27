package chapter6.part01;

/**
 * @author fanbin
 * @date 2019/10/27
 */
public class TryCatchExample {

    public static void main(String[] args) {

        try {
            int[] ints = new int[1];
            ints[1] = 10;
        } catch (Exception ex) {
            System.out.println("第一个异常被捕获了");
            ex.printStackTrace();
        }

        try {
            String str = "";
            str.substring(2, 3);
        } catch (Exception ex) {
            System.out.println("第二个异常被捕获了");
            ex.printStackTrace();
        }

        System.out.println("程序执行结束");


    }

}
