package chapter2.practice;

/**
 * @author fanbin
 * @date 2019/9/16
 */
public class P15 {
    public static void main(String[] args) {
        int[][] array = new int[5][5];
        for (int[] ints : array) {
            for (int i : ints) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
}
