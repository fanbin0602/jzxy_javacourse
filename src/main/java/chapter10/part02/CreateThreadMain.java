package chapter10.part02;

/**
 * @author fanbin
 * @date 2019/11/11
 */
public class CreateThreadMain {

    private static final String TEXT = "小时候我喜欢喝可乐，长大了不喜欢了，我没错可乐也没错。";

    public static void main(String[] args) {
        System.out.println("程序开始，当前线程名称" + Thread.currentThread().getName());

        for (int i = 1; i <= 2; i++) {
            String name = "My Thread - " + i;
            Thread thread = new Thread(new PrintThread(TEXT, 200 * i), name);
            thread.start();
        }

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
