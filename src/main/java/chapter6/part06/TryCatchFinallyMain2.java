package chapter6.part06;

/**
 * @author fanbin
 * @date 2019/10/31
 */
public class TryCatchFinallyMain2 {

    private static int VAL = 0;

    public static void main(String[] args) {
        String str = null;
        System.out.println(withFinally(str));
        System.out.println(VAL);
    }

    /**
     * 这是一个获取字符串长度的方法
     * @param str 这个参数是要获取长度的字符串
     * @return 返回值是传入字符串的长度
     */
    private static int withFinally(String str) {
        // 这个 len 是最重要返回的字符串的长度，先随便给个值，0。
        int len = 0;
        try {
            // 在这儿，直接返回字符串的长度
            // 这是正常的流程，比如传入了 "abc" ，就会返回一个 3
            // 但是，如果传入的字符串变量没有初始化对象，
            //      那它就是一个空的变量
            //      他就没办法求长度
            //      这里就会报空指针异常
            return str.length();
        } catch (Exception ex) {
            // 如果 try 里面的语句报异常了，
            // 程序就会跳到这个 catch 语句里
            // 然后给 len 一个值 -1
            // 让它返回
            // 也就是，如果字符串求长度的时候报错了
            // 我们就返回个 -1
            len = -1;
            System.out.println("执行了 catch 里的 return 语句");
            return len;
        } finally {

            // finally 里面的语句
            // 不管 try 里面的语句有没有出现异常
            // 也不管出现异常了有没有对应的 catch 语句捕获这个异常
            // finally 里面的语句都会执行

            // 也就是，每次都会执行下面这个打印语句
            System.out.println("执行了 finally 里的语句");
            // 可以认为 finally 语句会在方法返回后，后面的语句执行前，执行。

            // 有个要注意的是
            // 前面的 catch 返回了 len 变量，
            // 在这儿在修改 len 的值，不会影响方法的返回结果
            // 也就是：finally 里给 return 用的变量赋值没有用
            len = -2;

            // 但是这个给静态变量赋值的语句是可以生效的
            VAL = 999;
            System.out.println("finally 语句执行完毕");
        }
    }

}
