package chapter2.part4;

import java.util.Arrays;

/**
 * @author fanbin
 * @date 2019/9/15
 */
public class E07ArrayCopy {
    public static void main(String[] args) {
        char[] copyFrom = {'d', 'e', 'c', 'a', 'f', 'f', 'e', 'i', 'n', 'a', 't', 'e', 'd'};
        char[] copyTo = new char[7];

        System.arraycopy(copyFrom, 2, copyTo, 0, 7);
        System.out.println(Arrays.toString(copyTo));
    }
}
