package chapter4.part08;

/**
 * 手机
 * @author fanbin
 * @date 2019/10/7
 */
public class Phone {

    public Phone(String model, final double screenSize) {

        class Screen implements Component{

            public double size;

            public Screen() {
                this.size = screenSize;
            }

            public void describe() {
                // 局部内部类访问外部类的对象的成员属性的完整写法如下，类名.this.属性/方法
                System.out.println("这块屏幕属于一台" + Phone.this.model);
            }
        }

        this.model = model;
        this.screen = new Screen();
    }

    /**
     * 型号
     */
    private String model;

    public Component screen;



}