package chapter6.part06;

import java.io.IOException;

/**
 * @author fanbin
 * @date 2019/10/27
 */
public class ThrowMultiException {

    public static void main(String[] args) {
        catchMulti();
    }

    public static void catchMulti() {
        try {
            throwMultiException(0);
        }
//        catch (Exception ex) {
//            ex.printStackTrace();
//        }
        // 异常按顺序捕获，有多种匹配时，会编译错误
        catch (ClassNotFoundException ex) {
            ex.printStackTrace();
        }
        catch (IOException ex) {
            ex.printStackTrace();
        }
        // 写在这儿不会出错，为什么
        catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    public static void catchMultiSimple() {
        try {
            throwMultiException(0);
        } catch (ClassNotFoundException | IOException e) {
            e.printStackTrace();
        }
    }

    private static void throwMultiException(int i) throws ClassNotFoundException, IOException {

        switch (i) {
            case 1:
                throw new NullPointerException("demo");
            case 2:
                throw new ClassNotFoundException("demo");
            case 3:
                throw new IOException("demo");
        }

    }

}
