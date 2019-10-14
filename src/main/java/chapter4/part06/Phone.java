package chapter4.part06;

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

    public static class Screen{

        public double size;

    }

}