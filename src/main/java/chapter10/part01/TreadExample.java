package chapter10.part01;

/**
 * @author fanbin
 * @date 2019/11/11
 */
public class TreadExample {

    private static final String TEXT = "小时候我喜欢喝可乐，长大了不喜欢了，我没错可乐也没错。";

    public static void main(String[] args) throws InterruptedException {
        printSlowly(TEXT, 300);
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
