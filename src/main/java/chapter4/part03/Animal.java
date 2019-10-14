package chapter4.part03;

/**
 * 动物
 * @author fanbin
 * @date 2019/10/14
 */
public class Animal {

    /**
     * 颜色
     */
    private String color;

    /**
     * 重量
     */
    private double weight;

    public Animal() {

    }

    public Animal(String color, double weight) {
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
    public void talk() {
        System.out.println("I'm talking.");
    }

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
}
