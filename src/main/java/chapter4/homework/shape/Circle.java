package chapter4.homework.shape;

/**
 * 圆形
 * @author fanbin
 * @date 2019/10/18
 */
public class Circle extends Shape {

    /**
     * 半径
     */
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double area() {
        return Math.PI * radius * radius;
    }

}
