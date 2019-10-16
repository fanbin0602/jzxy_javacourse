package chapter4.part04;

/**
 * @author fanbin
 * @date 2019/10/14
 */
public class Main {

    public static void main(String[] args) {
        Bird bird = new Bird();
        Plane plane = new Plane();

        letItFly(bird);
        letItFly(plane);
    }

    public static void letItFly(Flyer flyer) {
        flyer.fly();
    }

}
