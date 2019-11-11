package chapter10.part04;

import java.util.concurrent.TimeUnit;

/**
 * @author fanbin
 * @date 2019/11/11
 */
public class DaemonThreadMain {

    private static final String TEXT = "小时候我喜欢喝可乐，长大了不喜欢了，我没错可乐也没错。";

    public static void main(String[] args) throws InterruptedException {
        System.out.println("程序开始，当前线程名称" + Thread.currentThread().getName());

        String name = "My Thread";
        Thread thread = new Thread(new PrintThread(TEXT, 200), name);
        // 设置为守护线程
        thread.setDaemon(true);
        // 可以随时改变线程（和是不是守护线程没有关系）的优先级，但是作用不能保证
        thread.setPriority(Thread.MAX_PRIORITY);
        thread.start();

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
                ex.printStackTrace();
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
}
