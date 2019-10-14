package chapter4.part04;

/**
 * @author fanbin
 * @date 2019/10/14
 */
public class Bird extends Animal implements Flyer {
    @Override
    public void talk() {
        System.out.println("叽叽喳喳");
    }

    public void fly() {
        System.out.println("我是一只鸟，我飞了");
    }
}
