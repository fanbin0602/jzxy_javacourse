package chapter2.part2;

/**
 * 布尔运算符
 * @author fanbin
 * @date 2019/9/2
 */
public class E4BoolOprt {

public static void main(String[] args) {
        boolean a = true;
        boolean b = false;

        System.out.println(a && b);
        System.out.println(a & b);
        System.out.println(a || b);
        System.out.println(a | b);

        System.out.println(a || (10 / 0 > 1));
        System.out.println(a | (10 / 0 > 1));
        }

        }
