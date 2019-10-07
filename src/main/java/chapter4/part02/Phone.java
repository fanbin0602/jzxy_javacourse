package chapter4.part02;

import chapter4.part02.components.Mainboard;

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
     * 主板
     */
    public Mainboard mainboard;

    /**
     * 描述
     */
    public void describe() {
        System.out.println("这是一个" + brand + " "+ color + " " + model + "手机，价值" + price + "元");
    }

    /**
     * 获取描述字符串
     * @return
     */
    public String getDescribeString(boolean containPrice) {
        String str = "这是一个" + brand + " "+ color + " " + model + "手机";
        if (containPrice) {
            str += "，价值" + price + "元";
        }
        str += "。";
        return str;
    }

    public String getDescribeString() {
        return getDescribeString(true);
    }

}