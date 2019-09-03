package chapter2.part2;

/**
 * 小括号运算符
 * @author fanbin
 * @date 2019/9/2
 */
public class E5ParentCprt {

    public static void main(String[] args) {
        int a = 10;
        int b = 88;
        boolean c = ((a + b) * a - 9 * (a + b)) == (a + b);

        System.out.println(c);
    }

}
