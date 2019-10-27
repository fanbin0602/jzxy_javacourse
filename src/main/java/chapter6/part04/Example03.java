package chapter6.part04;

/**
 * @author fanbin
 * @date 2019/10/27
 */
public class Example03 {
    public static void execute() {
        System.out.println("Example03.execute 开始");
        throw new RuntimeException("抛出异常");
//        System.out.println("方法执行");
//        System.out.println("Example03.execute 结束");
    }
}
