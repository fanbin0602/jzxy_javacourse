package chapter11.part03;

/**
 * @author fanbin
 * @date 2019/11/24
 */
public class Feb {
    public static void main(String[] args) throws InterruptedException {
        for (int i = 1; i <= 10; i++) {
            System.out.println(feb(i));
        }
    }

    public static int feb(int num) {
        if (num < 1) {
            throw new ArithmeticException("给定的序号不正确");
        }
        if (num == 1 || num == 2) {
            return 1;
        }
        return feb(num - 1) + feb(num - 2);
    }

}

