package chapter11.part01.step01;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

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
        try (
                ServerSocket ss = new ServerSocket(PORT);
                Socket s = ss.accept()
        ){
            s.getInputStream();
            s.getOutputStream();
            System.out.println("和客户端连接成功：" + s.getRemoteSocketAddress());
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

}
