package chapter4.part01;

/**
 * 手机
 * @author fanbin
 * @date 2019/10/7
 */
public class Phone {

    public Phone() {

    }

    public Phone(String model) {
        this.model = model;
    }

    /**
     * 型号
     */
    public String model;

    /**
     * 品牌
     */
    public String brand;

    /**
     * 价格
     */
    public double price;

    /**
     * 颜色
     */
    public String color;

    /**
     * 描述
     */
    public void describe() {
        System.out.println("这是一个" + brand + " "+ color + " " + model + "手机，价值" + price + "元");
    }

}