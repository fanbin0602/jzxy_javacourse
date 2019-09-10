package chapter2.part3;

/**
 * if-else 嵌套：找到三个数里最大的
 * @author fanbin
 * @date 2019/9/9
 */
public class E02MaxNumber {
    public static void main(String[] args) {
        int a = 10, b = 20, c = 30;
        if (a == b && b == c) {
            System.out.println("a, b, c 三个数字相等，值为：" + a);
        } else {
            if (a > b) {
                if (a > c) {
                    System.out.println("a 最大，值为：" + a);
                } else {
                    if (a == c) {
                        System.out.println("a, c 相等，且最大，值为：" + a);
                    } else {
                        System.out.println("c 最大，值为：" + c);
                    }
                }
            } else {
                if (b > c) {
                    if (a == b) {
                        System.out.println("a, b 相等，且最大，值为：" + a);
                    } else {
                        System.out.println("b 最大，值为：" + b);
                    }
                } else {
                    if (b == c) {
                        System.out.println("b, c 相等，且最大，值为：" + b);
                    } else {
                        System.out.println("c 最大，值为：" + c);
                    }
                }
            }
        }
    }
}
