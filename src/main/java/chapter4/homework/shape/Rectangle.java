package chapter4.homework.shape;

/**
 * 矩形
 * @author fanbin
 * @date 2019/10/18
 */
public class Rectangle extends Shape {

    /**
     * 长
     */
    private double length;

    /**
     * 宽
     */
    private double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public double area() {
        return length * width;
    }
}
