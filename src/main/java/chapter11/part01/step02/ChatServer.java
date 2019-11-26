package chapter11.part01.step02;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

/**
 * @author fanbin
 * @date 2019/11/24
 */
public class ChatServer {

    public static final int PORT = 54321;
    public static final Charset CHARSET = StandardCharsets.UTF_8;
    public static final String BYE = "bye";

    public static void main(String[] args) {
        withClient();
    }

    private static void withClient() {
        Scanner scanner = new Scanner(System.in);
        try (
                ServerSocket ss = new ServerSocket(PORT);
                Socket s = ss.accept();
                BufferedReader br = new BufferedReader(new InputStreamReader(s.getInputStream()));
                PrintWriter pw = new PrintWriter(new OutputStreamWriter(s.getOutputStream()))
        ){
            pw.println("客户端，我们连接成功了，可以开始说话了。");
            pw.flush();
            while (true) {
                String line = br.readLine();
                if (line.equals(BYE)) {
                    pw.println(BYE);
                    pw.flush();
                    break;
                }
                System.out.println("客户端说：" + line);
                String say = scanner.nextLine();
                pw.println(say);
                pw.flush();
            }
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

}
