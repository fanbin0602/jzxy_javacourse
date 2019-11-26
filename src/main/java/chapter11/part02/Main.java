package chapter11.part02;

/**
 * @author fanbin
 * @date 2019/11/26
 */
public class Main {
    public static void main(String[] args) throws InterruptedException {
        countDown(5);
    }

    public static void countDown(int start) throws InterruptedException {
        System.out.println(start);
        if (start == 0) {
            return;
        }
        Thread.sleep(1000);
        countDown(start - 1);
    }
}
