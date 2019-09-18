package chapter2.part4;

/**
 * @author fanbin
 * @date 2019/9/14
 */
public class E03InitValue {
    public static void main(String[] args) {
        int[] intArray = new int[1];
        System.out.println(intArray[0]);

        double[] doubleArray = new double[1];
        System.out.println(doubleArray[0]);

        char[] chars = new char[1];
        System.out.println(chars[0]);
        System.out.println((int)chars[0]);

        String[] strings = new String[1];
        System.out.println(strings[0]);
    }
}
