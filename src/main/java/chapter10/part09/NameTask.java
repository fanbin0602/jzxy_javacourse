package chapter10.part09;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;
import java.util.TimerTask;

/**
 * @author fanbin
 * @date 2019/11/17
 */
public class NameTask extends TimerTask {

    private  static File sourceFile = new File("." + File.separator + "students/demo.txt");

    public static List<String> nameList = new ArrayList<>();

    static {
        try (
                // 建立从文件到程序的数据输入。
                FileInputStream fis = new FileInputStream(sourceFile);
                // 将字节流转换为字符流。
                InputStreamReader isr = new InputStreamReader(fis, StandardCharsets.UTF_8);
                // 增加缓存功能，提高输入效率，并且可以一次读一行。
                BufferedReader reader = new BufferedReader(isr);
        ){
            String line;
            while ((line = reader.readLine()) != null) {
                String name = line.split(":")[1];
                nameList.add(name);
            }
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    @Override
    public void run() {
        if (nameList.size() <= 0) {
            throw new RuntimeException("点完名了");
        }
        int random = (int) (Math.random() * nameList.size());
        System.out.println("被点名的是：" + nameList.get(random) + "。");
        nameList.remove(random);
    }
}
