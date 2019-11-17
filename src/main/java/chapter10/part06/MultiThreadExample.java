package chapter10.part06;

/**
 * @author fanbin
 * @date 2019/11/11
 */
public class MultiThreadExample {
    public static void main(String[] args) {
        DataHolder dataHolder = new DataHolder();
        ChangeNumberThread increase = new ChangeNumberThread(1, Integer.MAX_VALUE, dataHolder);
        Thread increaseThread = new Thread(increase);
        increaseThread.start();
        ChangeNumberThread decrease = new ChangeNumberThread(-1, Integer.MAX_VALUE, dataHolder);
        Thread decreaseThread = new Thread(decrease);
        decreaseThread.start();
    }
}
