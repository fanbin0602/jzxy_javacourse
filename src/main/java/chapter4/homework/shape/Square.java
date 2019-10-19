package chapter4.homework.shape;

/**
 * 正方形
 * @author fanbin
 * @date 2019/10/18
 */
public class Square extends Rectangle {

    /**
     * 正方形是长和宽相等的矩形
     * @param sideLength
     */
    public Square(double sideLength) {
        super(sideLength, sideLength);
    }

}
