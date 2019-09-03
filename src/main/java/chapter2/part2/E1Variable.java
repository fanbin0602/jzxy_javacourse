package chapter2.part2;

/**
 * 变量
 * @author fanbin
 * @date 2019/9/2
 */
public class E1Variable {

    public static void main(String[] args) {
        int a = 1;
        int b = 2;
        int c = 3;

        int x = 0;

        int y = a * x + b * (x * x) + c * (x * x * x);

        System.out.println(y);
    }

}
