package chapter5.part6;

/**
 * @author fanbin
 * @date 2019/10/21
 */
public class Teacher {

    /**
     * 名字
     */
    private String name;

    public Teacher(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}
