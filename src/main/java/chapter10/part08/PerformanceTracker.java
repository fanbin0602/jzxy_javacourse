package chapter10.part08;

public class PerformanceTracker {

    // ThreadLocal一般都是 static的
    // 这样使用ThreadLocal，这些数据不用在应用程序之间传递，而且还可以为每个线程保留自己的一份数据
    private static final ThreadLocal<Long> PHASE_START_TIME = new ThreadLocal<>();
    private static final ThreadLocal<Long> DURATION = new ThreadLocal<>();

    public static void reset() {
        PHASE_START_TIME.set(-1L);
    }

    public static void startPhase() {
        PHASE_START_TIME.set(System.currentTimeMillis());
    }

    public static void endPhase(String phaseName) {
        long start = PHASE_START_TIME.get();
        DURATION.set(System.currentTimeMillis() - start);
    }

    public static void finish() {
        String out = Thread.currentThread().getName() + "执行时间为：" + DURATION.get();
        System.out.println(out);
    }

}
