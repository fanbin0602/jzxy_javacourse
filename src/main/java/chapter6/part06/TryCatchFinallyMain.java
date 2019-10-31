package chapter6.part06;

/**
 * @author fanbin
 * @date 2019/10/27
 */
public class TryCatchFinallyMain {

    private static int VAL = 0;

    public static void main(String[] args) {
        System.out.println(withFinally());
        System.out.println(VAL);
    }

    private static int withFinally() {
        int len = 0;
        try {
            String str = null;
            // str = "abc";
            return str.length();
        } catch (Exception ex) {
            len = -1;
            System.out.println("执行了 catch 里的 return 语句");
            return len;
        } finally {
            // 可以认为 finally 语句会在方法返回后，后面的语句执行前，在 return 后执行。
            // 无论是因为 return 结束还是因为出现异常结束，finally 都会执行
            System.out.println("执行了 finally 里的语句");

            // finally 里面最好不要有 return 语句
            // return -2;

            // finally 里给 return 用的变量赋值没有用
            // len = -2;

            VAL = 999;
            System.out.println("finally 语句执行完毕");
        }
    }

}
