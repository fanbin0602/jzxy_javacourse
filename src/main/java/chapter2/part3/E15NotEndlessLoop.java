package chapter2.part3;

/**
 * @author fanbin
 * @date 2019/9/9
 */
public class E15NotEndlessLoop {
    public static void main(String[] args) {
        int n = 5;

        int dividend = 100;
        int divisor = 2000000000;

        int found = 0;
        while (found < n) {
            if (dividend % divisor == 0) {
                System.out.println(dividend + "可以被" + divisor + "整除。商是" + dividend / divisor);
                found++;
            }
            dividend++;
        }
    }
}
