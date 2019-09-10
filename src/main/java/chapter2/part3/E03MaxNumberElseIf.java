package chapter2.part3;

/**
 * else if：找到三个数里最大的
 * @author fanbin
 * @date 2019/9/9
 */
public class E03MaxNumberElseIf {
    public static void main(String[] args) {
        int a = 10, b = 20, c = 30;
        if (a == b && b == c) {
            System.out.println("a，b和c相等。");
        } else if (a > b & a > c) {
            System.out.println("a的值最大。");
        } else if (b > a && b > c) {
            System.out.println("b的值最大。");
        } else if (c > a && c > b) {
            System.out.println("c的值最大。");
        } else if (a == b && b > c) {
            System.out.println("a和b等大最大。");
        } else if (b == c && b > a) {
            System.out.println("b和c等大最大。");
        } else if (a == c && b > c) {
            System.out.println("a和c等大最大。");
        }
    }
}
