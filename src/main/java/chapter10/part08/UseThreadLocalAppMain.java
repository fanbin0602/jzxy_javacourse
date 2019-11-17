package chapter10.part08;

public class UseThreadLocalAppMain {

    // ThreadLocal一般用在跨类，跨方法的传递一些值。

    public static void main(String[] args) {
        for (int i = 1; i <= 3; i++) {
            Thread workingThread = new Thread(() -> {
                System.out.println(Thread.currentThread().getName() + "开始处理……");
                PerformanceTracker.reset();

                Work work = new Work();
                work.doWork();

                PerformanceTracker.finish();
                System.out.println(Thread.currentThread().getName() + "处理结束");

            }, "Work-" + i);
            workingThread.start();
        }
    }
}
