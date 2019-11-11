package chapter10.part03;

/**
 * 线程生命周期中的各个状态
 * @author fanbin
 * @date 2019/11/11
 */
public class LifeCircle {

    public static void main(String[] args) {

        System.out.println(Thread.State.NEW);
        System.out.println(Thread.State.RUNNABLE);
        System.out.println(Thread.State.BLOCKED);
        System.out.println(Thread.State.WAITING);
        System.out.println(Thread.State.TIMED_WAITING);
        System.out.println(Thread.State.TERMINATED);

    }

}
