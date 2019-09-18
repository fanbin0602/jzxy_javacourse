package chapter2.part4;

/**
 * @author fanbin
 * @date 2019/9/15
 */
public class E04ObjectArray {
    public static void main(String[] args) {
        Point[] points = new Point[3];
        System.out.println(points[0]);
        System.out.println(points[0].x);
        System.out.println(points[0].y);

//        points[0] = new Point();
//        System.out.println(points[0]);
//        System.out.println(points[0].x);
//        System.out.println(points[0].y);

//        points[0].x = 1;
//        points[0].y = 2;
//        System.out.println(points[0]);
//        System.out.println(points[0].x);
//        System.out.println(points[0].y);
    }
}

class Point{
    int x;
    int y;
}