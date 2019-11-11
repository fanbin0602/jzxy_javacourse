package chapter10.part01;

/**
 * 线程栈的例子。记得打断点，并且用 debug 模式运行。
 * @author fanbin
 * @date 2019/11/11
 */
public class ThreadStackExample {
    public static void main(String[] args) {
        m1();
    }

    private static void m1(){
        m2();
    }

    private static void m2() {
        int a =999;
        m3();
    }

    private static void m3() {
        int a =333;
        m4();
    }

    private static void m4() {
        m5();
    }

    private static void m5() {
        int a = 555;
        m6();
    }

    private static void m6() {
        System.out.println("在这儿打个断点");
    }
}
