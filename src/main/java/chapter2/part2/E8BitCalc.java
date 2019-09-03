package chapter2.part2;

/**
 * 按位运算
 * @author fanbin
 * @date 2019/9/2
 */
public class E8BitCalc {

    public static void main(String[] args) {
        int a = 0xF8;
        System.out.println(Integer.toBinaryString(a));
        int b = 0xF4;
        System.out.println(Integer.toBinaryString(b));
        int c = 0xFF;
        System.out.println(Integer.toBinaryString(c));

        System.out.println(a & b);
        System.out.println(Integer.toBinaryString(a & b));
        System.out.println(a | b);
        System.out.println(Integer.toBinaryString(a | b));
        System.out.println(a ^ b);
        System.out.println(Integer.toBinaryString(a ^ b));

        System.out.println(~c);
        System.out.println(Integer.toBinaryString(~c));

    }

}
