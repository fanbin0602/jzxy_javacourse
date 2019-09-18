package chapter2.part4;

/**
 * @author fanbin
 * @date 2019/9/14
 */
public class E01Array {
    public static void main(String[] args) {

        // 声明并初始化数组
        String[] languages = new String[3];

        // 为数组中的每一个元素赋值
        languages[0] = "C";
        languages[1] = "Java";
        languages[2] = "Python";

        // 读取数组中的每一个元素
        System.out.println(languages[0]);
        System.out.println(languages[1]);
        System.out.println(languages[2]);

        // 读取数组的长度属性
        System.out.println(languages.length);
    }
}
