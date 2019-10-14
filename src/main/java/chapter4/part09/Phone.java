package chapter4.part09;

/**
 * 手机
 * @author fanbin
 * @date 2019/10/7
 */
public class Phone {

    public Phone(String model) {

        this.model = model;
        this.screen = new Component() {

            public void describe() {
                System.out.println("这是块屏幕");
            }
        };



    }

    /**
     * 型号
     */
    private String model;

    public Component screen;

    public Component camera;

    public void setCamera(Component camera) {
        this.camera = camera;
    }



}