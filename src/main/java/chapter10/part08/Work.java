package chapter10.part08;

import java.util.concurrent.TimeUnit;

public class Work {

    public void doWork() {
        PerformanceTracker.startPhase();

        try {
            Thread.sleep((int)(Math.random()* TimeUnit.SECONDS.toMillis(5)));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        PerformanceTracker.endPhase("DBQuery");
    }

}
