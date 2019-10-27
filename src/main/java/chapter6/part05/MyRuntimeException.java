package chapter6.part05;

/**
 * @author fanbin
 * @date 2019/10/27
 */
public class MyRuntimeException extends RuntimeException {

    public MyRuntimeException() {
    }

    public MyRuntimeException(String message) {
        super(message);
    }

    public MyRuntimeException(String message, Throwable cause) {
        super(message, cause);
    }

    public MyRuntimeException(Throwable cause) {
        super(cause);
    }
}
