package chapter2.part2;

/**
 * 强制类型转换
 * @author fanbin
 * @date 2019/9/2
 */
public class E92ForceConvert {

    public static void main(String[] args) {
        int intVal = 99;
        long longVal = 19999;
        intVal = (int) longVal;

        float floatVal = 11.32f;
        double doubleVal = 3344556.789;
        floatVal = (float) doubleVal;

        int a = 65;
        char b = (char) a;

        // 强制类型转换导致精度丢失

        int intVal2 = 99;
        long longVal2 = 5555555555555L;
        intVal2 = (int) longVal2;
        System.out.println(intVal2); // -2132125469

        float floatVal2 = 11.32f;
        double doubleVal2 = 1234567890.123456;
        floatVal2 = (float) doubleVal2;
        System.out.println(floatVal2); // 1.23456794E9
        System.out.println(doubleVal2); // 1.234567890123456E9
    }

}
