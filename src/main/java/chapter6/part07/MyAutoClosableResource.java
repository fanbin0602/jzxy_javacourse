package chapter6.part07;

import java.io.IOException;

/**
 * @author fanbin
 * @date 2019/10/27
 */
public class MyAutoClosableResource implements AutoCloseable {

    private String resName;

    private int counter;

    public MyAutoClosableResource(String resName) {
        this.resName = resName;
    }

    public String read() throws IOException {
        counter++;
        if (Math.random() > 0.1) {
            return "恭喜你从资源【" + resName + "】中读取了" + counter + "次";
        } else {
            throw new IOException("资源跑了～");
        }
    }

    @Override
    public void close() throws Exception {
        System.out.println("资源释放了：" + resName);
    }
}
