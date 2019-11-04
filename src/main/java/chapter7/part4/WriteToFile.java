package chapter7.part4;

import java.io.*;
import java.util.Scanner;

/**
 * @author fanbin
 * @date 2019/11/4
 */
public class WriteToFile {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        // 记得写入前先创建文件
        File file = createFile();

        try (
                // 创建一个程序要文件的字节流
                FileOutputStream fos = new FileOutputStream(file);
                // 创建一个可以消费自己输出流的字符输出流
                OutputStreamWriter osw = new OutputStreamWriter(fos);
                // 方便按行写入字符
                PrintWriter writer = new PrintWriter(osw)
        ){
            // 开始布置作业
            System.out.println("开始出题。（输入空行结束出题）");

            // 当前的题号
            int number = 1;

            while (true) {
                System.out.println("输入第" + number + "题：");
                String line = scanner.nextLine().trim();
                if (line == null || line.length() == 0) {
                    System.out.println("出题结束，退出。");
                    break;
                }
                String lineToWrite = number + ". " + line;
                writer.println(lineToWrite);
                // 冲一下，将当前流中内容全部写入文件。
                writer.flush();
                number++;
            }

            return ;
        } catch (IOException ex) {
            ex.printStackTrace();
        }

    }

    private static File createFile() {
        File file = new File("." + File.separator + "homework.txt");

        try {
            if (file.isFile()) {
                System.out.println("文件已经存在，删除掉重新创建");
                file.delete();
            }
            file.createNewFile();
            System.out.println("文件创建成功");

        } catch (IOException ex) {
            ex.printStackTrace();
        }

        return file;
    }

}
