package chapter6.part02;

/**
 * 必须处理的异常
 * @author fanbin
 * @date 2019/10/27
 */
public class CheckedExceptionExample {
    public static void main(String[] args) throws ClassNotFoundException {
        try {
            Class clazz = Class.forName("chapter6.part02.Example");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
