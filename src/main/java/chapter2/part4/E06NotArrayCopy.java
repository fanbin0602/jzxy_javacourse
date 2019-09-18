package chapter2.part4;

/**
 * @author fanbin
 * @date 2019/9/15
 */
public class E06NotArrayCopy {
    public static void main(String[] args) {
        int[] a = new int[3];
        int[] b = a;
        a[0] = 10;
        System.out.println(b[0]);
    }
}
