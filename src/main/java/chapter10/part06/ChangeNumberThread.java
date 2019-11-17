package chapter10.part06;

/**
 * @author fanbin
 * @date 2019/11/11
 */
public class ChangeNumberThread implements Runnable {

    private int delta;
    private int loopCount;
    private DataHolder dataHolder;

    public ChangeNumberThread(int delta, int loopCount, DataHolder dataHolder) {
        this.delta = delta;
        this.loopCount = loopCount;
        this.dataHolder = dataHolder;
    }

    @Override
    public void run() {
        for (int i = 0; i < loopCount; i++) {
            dataHolder.changeNumber(delta);
        }
        dataHolder.printNumber();
    }
}
