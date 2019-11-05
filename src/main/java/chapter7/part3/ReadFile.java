package chapter7.part3;

import java.io.*;
import java.nio.charset.StandardCharsets;

/**
 * @author fanbin
 * @date 2019/11/4
 */
public class ReadFile {

    public static void main(String[] args) {

        File sourceFile = new File("." + File.separator + "students/demo.txt");

        // try with resource，思考：为什么要这样写？
        try (
                // 建立从文件到程序的数据输入。
                FileInputStream fis = new FileInputStream(sourceFile);
                // 将字节流转换为字符流。
                InputStreamReader isr = new InputStreamReader(fis, StandardCharsets.UTF_8);
                // 增加缓存功能，提高输入效率，并且可以一次读一行。
                BufferedReader reader = new BufferedReader(isr);
        ){
            System.out.println("名单里的同学有：");
            String line = null;
            while ((line = reader.readLine()) != null) {
                String name = line.split(":")[1];
                String number = line.split(":")[0];
                System.out.println(name + "(" + number + ")");
            }
            return;
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }


}
