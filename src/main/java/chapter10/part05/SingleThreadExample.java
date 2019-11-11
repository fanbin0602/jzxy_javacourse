package chapter10.part05;

/**
 * @author fanbin
 * @date 2019/11/11
 */
public class SingleThreadExample {

    public static void main(String[] args) {
        DataHolder dataHolder = new DataHolder();
        ChangeNumberThread increase = new ChangeNumberThread(1, Integer.MAX_VALUE, dataHolder);
        increase.run();
        ChangeNumberThread decrease = new ChangeNumberThread(-1, Integer.MAX_VALUE, dataHolder);
        decrease.run();
    }
}
