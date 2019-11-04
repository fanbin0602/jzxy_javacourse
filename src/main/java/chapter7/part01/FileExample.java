package chapter7.part01;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

/**
 * File 类用法示例
 * @author fanbin
 * @date 2019/11/4
 */
public class FileExample {

    private static final String ROOT_PATH = "." + File.separator;
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        // 打印系统的路径分隔符和环境变量分隔符
        printSeparators();

        String path = "java" + File.separator+"io" + File.separator + "example";

        try {
            // 创建文件夹
            File dir = createDir(path);
            // 给刚刚创建的文件夹重命名。
            dir = renameDir(dir);
            // 在刚刚创建的文件夹中创建文本文件。
            String fileName = createFile(dir);
            // 重命名刚刚创建的文件
            String newFileName = renameFile(dir, fileName);
            // 删除文件
            deleteFile(dir, newFileName);
            // 删除文件夹
            deleteDir(dir);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    /**
     * 创建文件夹
     * @param path 文件夹路径
     * @return 结果
     * @throws IOException 当无法创建时方法可能会抛出 IOException
     */
    private static File createDir(String path) throws IOException {
        File dir = new File(ROOT_PATH, path);
        System.out.println("要创建的文件夹路径是：" + dir.toString());
        // 先判断是给定的路径是否存在文件夹，如果存在则无需创建。
        if (dir.exists() && dir.isDirectory()) {
            System.out.println("文件夹已存在");
        } else {
            boolean result = dir.mkdirs();
            if (result) {
                System.out.println("文件夹创建成功");
            } else {
                throw new IOException("无法创建文件夹");
            }
        }
        return dir;
    }

    /**
     * 重命名给定的文件夹
     * @param dir 要重命名的文件夹
     * @return 新的文件夹
     * @throws IOException 当重命名失败时，抛出 IOException
     */
    private static File renameDir(File dir) throws IOException {
        System.out.println("请输入新的文件夹名称：");
        String newDirName = scanner.nextLine().trim();
        File newDir = new File(dir.getParentFile(), newDirName);
        boolean result = dir.renameTo(newDir);
        if (result) {
            System.out.println("重命名为[" + newDirName + "]成功");
        } else {
            throw new IOException("重命名失败");
        }
        return newDir;
    }

    /**
     * 在给定的文件夹中创建文本文件
     * @param dir 给定的文件夹
     * @return 返回创建成功的文件名称
     * @throws IOException 创建失败时抛出 IOException
     */
    private static String createFile(File dir) throws IOException {
        System.out.println("请输入要创建的文件名称：");
        String fileName = scanner.nextLine().trim();
        File file = new File(dir, fileName + ".txt");
        boolean result = file.createNewFile();
        if (result) {
            System.out.println("文件[" + fileName + ".txt]创建成功");
        } else {
            throw new IOException("文件创建失败");
        }
        return fileName;
    }

    /**
     * 重命名文本文件
     * @param dir 文件路径
     * @param fileName 文件名
     * @return 新文件名
     * @throws IOException 重命名失败时抛出 IOException
     */
    private static String renameFile(File dir, String fileName) throws IOException {
        System.out.println("请输入新的文件名称：");
        String newFileName = scanner.nextLine().trim();
        File file = new File(dir, fileName + ".txt");
        File newFile = new File(dir, newFileName + ".txt");
        boolean result = file.renameTo(newFile);
        if (result) {
            System.out.println("文件已经重命名为[" + newFileName + "]");
        } else {
            throw new IOException("文件重命名失败");
        }
        return newFileName;
    }

    /**
     * 删除文件
     * @param dir 文件路径
     * @param fileName 文件名
     * @throws IOException 删除失败抛出异常
     */
    private static void deleteFile(File dir, String fileName) throws IOException {
        System.out.println("确认删除" + fileName + "？(true/false)");
        boolean delete = scanner.nextBoolean();
        if (delete) {
            File file = new File(dir, fileName + ".txt");
            boolean result = file.delete();
            if (result) {
                System.out.println("文件删除成功");
            } else {
                throw new IOException("文件删除失败");
            }
        } else {
            System.out.println("已取消");
        }

    }

    /**
     * 删除文件夹
     * @param dir 文件夹路径
     * @throws IOException 删除失败抛出异常
     */
    private static void deleteDir(File dir) throws IOException {
        System.out.println("确认删除文件夹？(true/false)");
        boolean delete = scanner.nextBoolean();
        if (delete) {
            boolean result = dir.delete();
            if (result) {
                System.out.println("文件夹删除成功");
            } else {
                throw new IOException("文件夹删除失败");
            }
        } else {
            System.out.println("已取消");
        }
    }

    private static void printSeparators() {
        System.out.println("文件路径分割符 - " + File.separator);
        System.out.println("环境变量分隔符 - " + File.pathSeparator);
    }
}
