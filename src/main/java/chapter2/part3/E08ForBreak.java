package chapter2.part3;

/**
 * @author fanbin
 * @date 2019/9/9
 */
public class E08ForBreak {
    public static void main(String[] args) {
        int a = 10, b = 35;
        for (; b <= 100; b++) {
            System.out.println(b + " % " + a + " -> " + (b % a));
            if (b % a == 0) {
                System.out.println(a + "可以被" + b + "整除，" + "商为" + (b / a));
                break;
            }
        }
    }
}
