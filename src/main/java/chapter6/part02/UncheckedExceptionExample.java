package chapter6.part02;

/**
 * 不要求必须处理的异常
 * @author fanbin
 * @date 2019/10/27
 */
public class UncheckedExceptionExample {
    public static void main(String[] args) {
        String str = null;
        System.out.println(str.toUpperCase());
    }
}
