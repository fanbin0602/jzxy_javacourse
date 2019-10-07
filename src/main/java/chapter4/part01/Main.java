package chapter4.part01;

/**
 * @author fanbin
 * @date 2019/10/7
 */
public class Main {

    public static void main(String[] args) {

        // 使用缺省的构造方法
//        Phone phone = new Phone();
//        phone.model = "iPhone 11";
//        phone.brand = "苹果";
//        phone.color = "白色";
//        phone.price = 5499;
//        phone.describe();

        // 使用自定义的构造方法
        Phone phone = new Phone("iPhone 11");
        phone.model = "iPhone 11";
        phone.brand = "苹果";
        phone.color = "白色";
        phone.price = 5499.00;
        phone.describe();

    }

}
