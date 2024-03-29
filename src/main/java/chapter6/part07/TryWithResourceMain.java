package chapter6.part07;

/**
 * @author fanbin
 * @date 2019/10/28
 */
public class TryWithResourceMain {

    public static void main(String[] args) {
        try (
                MyAutoClosableResource res1 = new MyAutoClosableResource("res1");
                MyAutoClosableResource res2 = new MyAutoClosableResource("res2")
                ) {
            while (true) {
                System.out.println(res1.read());
                System.out.println(res2.read());
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

}
