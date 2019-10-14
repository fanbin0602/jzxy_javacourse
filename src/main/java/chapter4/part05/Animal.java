package chapter4.part05;

/**
 * 动物
 * @author fanbin
 * @date 2019/10/14
 */
public abstract class Animal {

    public static int count;

    static {
        count = 0;
        System.out.println("开始从 0 开始计数了。");
    }

    /**
     * 颜色
     */
    private String color;

    /**
     * 重量
     */
    private double weight;

    public Animal() {
        System.out.println("现在有" + ++count + "个动物被实例化了。");
    }

    public Animal(String color, double weight) {
        this();
        this.color = color;
        this.weight = weight;
    }

    public void run() {
        System.out.println("Go Go Go!");
    }

    public void sleep() {
        System.out.println("zzzZZZ~");
    }

    /**
     * 说话
     */
    public abstract void talk();

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public static int countAnimals() {
        return countAnimals(false);
    }

    public static int countAnimals(boolean print) {
        if (print) {
            System.out.println("现在一共有" + count + "只动物被实例化了。");
        }
        return count;
    }
}
