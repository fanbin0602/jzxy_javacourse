package chapter6.part03;

/**
 * @author fanbin
 * @date 2019/10/27
 */
public class ThrowExceptionExample {

    public static void main(String[] args) {
        // 当调用的方法声明了会抛出 checked exception 时
        // 调用方也必须处理这个异常，用 try-catch 语句，或着传递抛出
        try {
            causeException();
        } catch (Exception e) {
            e.printStackTrace();
        }
        causeRuntimeException();

    }

    public static void causeException() throws Exception {
        // 创建一个 checked exception ，然后用 throw 关键字抛出
        // 这时就需要方法有对应的 throws 语句，throws 语句的类型要能覆盖实际异常的类型
        throw new Exception("");
    }

    public static void causeRuntimeException() {
        // 创建一个 unchecked exception ，然后用 throw 关键字抛出
        // 这时候，方法可以有、也可以没有 throws 语句。
        throw new RuntimeException("");
    }

    /**
     * 抛出异常的类型，必须是实际异常类本身或者它的父类
     * throws ClassNotFoundException, NoSuchFieldException 可以换成 throws Exception
     * 可以抛出多个异常类型，用逗号分隔
     * @throws ClassNotFoundException
     * @throws NoSuchFieldException
     */
    public static void throwMultiException() throws ClassNotFoundException, NoSuchFieldException {
        Class clazz = null;
        try {
            clazz = Class.forName("wrong.name");
            clazz.getField("nothing");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (NoSuchFieldException e) {
            e.printStackTrace();
        }
    }

}
