package chapter4.part07;

/**
 * 手机
 * @author fanbin
 * @date 2019/10/7
 */
public class Phone {

    public Phone(String model, double screenSize) {
        this.model = model;
        this.screen = new Screen(screenSize);
    }

    /**
     * 型号
     */
    public String model;

    public Screen screen;

    public class Screen{

        public double size;

        public Screen(double size) {
            this.size = size;
        }

        public void describe() {
            // 成员内部类中有一个外部类的引用，其访问外部类的对象的成员属性就是使用这个引用，完整写法是：类名.this.属性/方法
            System.out.println("这块屏幕属于一台" + Phone.this.model);
        }

    }

}