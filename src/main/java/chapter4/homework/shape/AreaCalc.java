package chapter4.homework.shape;

/**
 * 计算图形面积
 * @author fanbin
 * @date 2019/10/18
 */
public class AreaCalc {
    public static void main(String[] args) {

        // 计算一个圆形的面积
        double radiusOfCircle = 10;
        Circle circle = new Circle(radiusOfCircle);
        double areaOfCircle = circle.area();
        System.out.println("半径是" + radiusOfCircle + "的圆形，面积是" + areaOfCircle);

        // 计算一个矩形的面积
        double lengthOfRect = 100;
        double widthOfRect = 75;
        Rectangle rectangle = new Rectangle(100, 75);
        double areaOfRect = rectangle.area();
        System.out.println("长为" + lengthOfRect + "宽为" + widthOfRect + "的矩形，面积是" + areaOfRect);

        // 计算一个正方形的面积
        double sideLengthOfSquare = 50;
        Square square = new Square(sideLengthOfSquare);
        double areaOfSquare = square.area();
        System.out.println("边长为" + sideLengthOfSquare + "的正方形，面积是" + areaOfSquare);

    }
}
