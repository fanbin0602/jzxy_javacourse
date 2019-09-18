package chapter2.part4;

/**
 * @author fanbin
 * @date 2019/9/15
 */
public class E05PointToNewArray {
    public static void main(String[] args) {
        int[] array = new int[3];
        array[0] = 9;
        System.out.println("array长度为" + array.length + "。array[0] = " + array[0]);
        array = new int[32];
        System.out.println("array长度为" + array.length + "。array[0] = " + array[0]);
    }
}
