package chapter4.part03;

/**
 * @author fanbin
 * @date 2019/10/14
 */
public class Main {

    public static void main(String[] args) {
        // Cat 类
//        Cat cat = new Cat();
//        cat.setColor("White");
//        cat.setWeight(20);
//        cat.setName("Tom");
//
//        cat.talk(); // ?
//        cat.catchMouse();

        // 父类的对象只会执行父类的方法逻辑
//        Animal animal = new Animal();
//        animal.talk();
//        animal.catchMouse();

        // 使用构造方法
//        Cat cat = new Cat("Tom", "White", 20);
//        cat.talk();
//        cat.catchMouse();

        // 多态
//        Animal animal = new Cat("Tom", "White", 20);
//        animal.talk();
//        animal.catchMouse();

        // 类型抢注转换
//        Animal animal = new Cat("Tom", "White", 20);
//        animal.talk();
//
//        Cat cat = (Cat)animal;
//        cat.catchMouse();

        // instance 关键字
        Animal animal = new Cat("Tom", "White", 20);
        if(animal instanceof Cat) {
            System.out.println("1");
            Cat cat = (Cat) animal;
            cat.catchMouse();
        }
        Animal animal2 = new Dog();
        if(animal2 instanceof Cat) {
            System.out.println("2");
            Cat cat = (Cat) animal2;
            cat.catchMouse();
        }

    }

}
