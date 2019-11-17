package chapter10.part06;

/**
 * @author fanbin
 * @date 2019/11/11
 */
public class DataHolder {

    private int number = 0;

    public synchronized void changeNumber(int delta) {
        number += delta;
    }

    public void printNumber() {
        System.out.println("number 的值是：" + number);
    }

}
