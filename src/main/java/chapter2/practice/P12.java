package chapter2.practice;

/**
 * @author fanbin
 * @date 2019/9/16
 */
public class P12 {
    public static void main(String[] args) {
        for (int i = 1; i <= 6; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
