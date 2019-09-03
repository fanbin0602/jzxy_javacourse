package chapter2.part2;

/**
 * 位移运算
 * @author fanbin
 * @date 2019/9/2
 */
public class E9BitShift {

    public static void main(String[] args) {
        int a = 0x400; // 0100 0000 0000
        System.out.println(a);
        System.out.println(Integer.toBinaryString(a));
        System.out.println(a >> 1);
        System.out.println(Integer.toBinaryString(a >> 1));
        System.out.println(a >> 2);
        System.out.println(Integer.toBinaryString(a >> 2));

        System.out.println(a << 1);
        System.out.println(Integer.toBinaryString(a << 1));
        System.out.println(a << 2);
        System.out.println(Integer.toBinaryString(a << 2));

        int b = -0x400; // - 0100 0000 0000
        System.out.println(b);
        System.out.println(Integer.toBinaryString(b));
        System.out.println(b >> 1);
        System.out.println(Integer.toBinaryString(b >> 1));
        System.out.println(b >> 2);
        System.out.println(Integer.toBinaryString(b >> 2));

        System.out.println(b << 1);
        System.out.println(Integer.toBinaryString(b << 1));
        System.out.println(b << 2);
        System.out.println(Integer.toBinaryString(b << 2));

        System.out.println(b >>> 1); //
        System.out.println(Integer.toBinaryString(b >>> 1));
        System.out.println(b >>> 2); //
        System.out.println(Integer.toBinaryString(b >>> 2));
    }

}
