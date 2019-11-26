package chapter11.part01.step01;

import java.io.IOException;
import java.net.Socket;

import static chapter11.part01.step01.ChatServer.PORT;

/**
 * @author fanbin
 * @date 2019/11/24
 */
public class ChatClinet {

    public static void main(String[] args) {
        withServer();
    }

    private static void withServer() {
        try(
                Socket s = new Socket("localhost", PORT);
        ) {
            System.out.println("和服务端连接成功：" + s.getRemoteSocketAddress());
        } catch (IOException ex) {
            ex.printStackTrace();
        }

    }

}
