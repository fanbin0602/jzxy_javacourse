package chapter2.practice;

/**
 * @author fanbin
 * @date 2019/9/16
 */
public class P10 {
    public static void main(String[] args) {
        int i = 1000;
        while (true) {
            if (i < 10) {
                continue;
            }
            i = i - 10;
        }
    }
}
