package chapter4.part09;

/**
 * @author fanbin
 * @date 2019/10/14
 */
public class Main {
    public static void main(String[] args) {
        Phone phone = new Phone("iPhone");
        phone.setCamera(new Component() {
            public void describe() {
                System.out.println("这是颗摄像头");
            }
        });

        phone.screen.describe();
        phone.camera.describe();

    }
}
