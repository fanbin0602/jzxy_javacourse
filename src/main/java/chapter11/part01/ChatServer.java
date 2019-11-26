package chapter11.part01;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

import static chapter11.part01.Chat.PORT;

/**
 * @author fanbin
 * @date 2019/11/24
 */
public class ChatServer {

    public static void main(String[] args) {
        withClient();
    }

    private static void withClient() {
        try (
                ServerSocket ss = new ServerSocket(PORT);
                Socket s = ss.accept();
        ){
            Chat chat = new Chat("客户端", "我们可以开始聊天了", s);
            chat.start();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

}
