package chapter4.part05;

/**
 * @author fanbin
 * @date 2019/10/14
 */
public class Main {

    public static void main(String[] args) {

        /**
         * 第一部分：静态变量
         */
        Cat cat = new Cat("Tom", "White", 20);
        Dog dog = new Dog();
        // 使用别的类的静态变量的时候，需要使用完整形态：类名.静态变量名字
        System.out.println(Animal.count);
        // 还有一些我们常用的值，Java 也给我们提供了现成的静态变量。
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);
        System.out.println(Math.PI);

        /**
         * 第二部分：静态方法
         */
        int count = Animal.countAnimals();
        System.out.println("count = " + count);
        Animal.countAnimals(true);

        int[] array = new int[2];
        System.out.println(array.length);

        /**
         * 第三部分：final 关键字的使用，大家可以自己动手修改前面的示例代码来看效果
         */


    }

}
