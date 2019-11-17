package chapter10.part09;

import java.util.Timer;
import java.util.concurrent.TimeUnit;

/**
 * @author fanbin
 * @date 2019/11/17
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("开始创建定时任务");
        Timer timer = new Timer();
        // TODO 使用固定的频率schedule任务
        timer.scheduleAtFixedRate(new NameTask(), 0, TimeUnit.SECONDS.toMillis(2));
        System.out.println("结束创建定时任务");
    }
}
