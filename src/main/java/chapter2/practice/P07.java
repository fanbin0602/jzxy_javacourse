package chapter2.practice;

/**
 * @author fanbin
 * @date 2019/9/16
 */
public class P07 {
    public static void main(String[] args) {
        int i = 1;
        while (i < 10) {
            if ((i++) % 2 == 0) {
                System.out.println(i);
            }
        }
    }

    // 好多人答案写3、9
}
