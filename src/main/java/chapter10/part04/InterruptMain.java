package chapter10.part04;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

/**
 * @author fanbin
 * @date 2019/11/11
 */
public class InterruptMain {

    private static final String TEXT = "小时候我喜欢喝可乐，长大了不喜欢了，我没错可乐也没错。";

    public static void main(String[] args) throws InterruptedException {
        System.out.println("程序开始，当前线程名称" + Thread.currentThread().getName());
        List<Thread> threadList = new ArrayList<>();
        for (int i = 1; i <= 10; i++) {
            String name = "My Thread - " + i;
            Thread thread = new Thread(new PrintThread(TEXT, 200 * i), name);
            // Thread thread = new Thread(new NotHandleInterrupt(TimeUnit.SECONDS.toMillis(8)));
            thread.start();
            threadList.add(thread);
        }
        System.out.println("休息五秒");
        Thread.sleep(TimeUnit.SECONDS.toMillis(5));

        System.out.println("开始 interrupt 线程");
        for (Thread thread : threadList) {
            thread.interrupt();
        }
        System.out.println("结束 interrupt 线程");
        System.out.println("休息五秒");
        Thread.sleep(TimeUnit.SECONDS.toMillis(5));

        System.out.println();
        System.out.println("程序结束，当前线程名称" + Thread.currentThread().getName());
    }

    /**
     * 一个打印内容的线程类，实现 Runnable 接口，并实现 run 方法
     */
    static class PrintThread implements Runnable{

        private String content;
        private long interval;

        public PrintThread(String content, long interval) {
            this.content = content;
            this.interval = interval;
        }

        @Override
        public void run() {
            try {
                System.out.println("线程[" + Thread.currentThread().getName() + "]开始");
                printSlowly(content, interval);
                System.out.println("线程[" + Thread.currentThread().getName() + "]开始");
            } catch (InterruptedException ex) {
                System.out.println(Thread.currentThread().getName() + "被结束");
            }
        }
    }

    /**
     * 慢悠悠地输出一段话
     * @param content 要输出的内容
     * @param interval 每输出一个字之间之前的等待时间（毫秒）
     * @throws InterruptedException
     */
    public static void printSlowly(String content, long interval) throws InterruptedException {
        for (char c : content.toCharArray()) {
            Thread.sleep(interval);
            System.out.print(c);
        }
        System.out.println();
    }

    static class NotHandleInterrupt implements Runnable {

        private long duration;

        public NotHandleInterrupt(long duration) {
            this.duration = duration;
        }

        @Override
        public void run() {
            System.out.println(Thread.currentThread().getName() + "执行开始");

            long start = System.currentTimeMillis();
            boolean isInterrupted = Thread.currentThread().isInterrupted();
            System.out.println(Thread.currentThread().getName() + "的isInterrupted=" + isInterrupted);
            while (true) {
                if (isInterrupted != Thread.currentThread().isInterrupted()) {
                    isInterrupted = Thread.currentThread().isInterrupted();
                    System.out.println("发现线程" + Thread.currentThread().getName() + "的isInterrupted变化为：" + isInterrupted);
                    System.out.println("但是线程决定什么都不做");
                }
                if (System.currentTimeMillis() - start > duration) {
                    break;
                }
            }
            System.out.println(Thread.currentThread().getName() + "执行结束");

        }
    }
}
