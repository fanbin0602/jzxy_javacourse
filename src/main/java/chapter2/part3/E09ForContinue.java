package chapter2.part3;

/**
 * @author fanbin
 * @date 2019/9/9
 */
public class E09ForContinue {
    public static void main(String[] args) {
        int a = 10, b = 35;
        for (; b <= 100; b++) {
            if (b % a != 0) {
                continue;
            }
            System.out.println(a + "可以被" + b + "整除，" + "商为" + (b / a));
        }
    }
}
