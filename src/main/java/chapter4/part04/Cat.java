package chapter4.part04;

/**
 * 猫
 * @author fanbin
 * @date 2019/10/14
 */
public class Cat extends Animal {

    /**
     * 名字
     */
    private String name;

    public Cat() {
        super();
    }

    /**
     * 构造方法
     * @param name
     * @param color
     * @param weight
     */
    public Cat(String name, String color, double weight) {
        super(color, weight);
        this.name = name;
    }

    /**
     * 抓老鼠
     */
    public void catchMouse() {
        System.out.println("抓到一只老鼠！");
    }

    /**
     * 抽象方法没有自己的方法逻辑，必须在非抽象的子类中被实现
     */
    @Override
    public void talk() {
        // super.talk(); 父类（抽象类）的 talk 方法无法被调用
        System.out.println("喵～");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
