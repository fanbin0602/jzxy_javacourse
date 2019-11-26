package chapter11.part01;

import java.io.IOException;
import java.net.Socket;

import static chapter11.part01.Chat.PORT;

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
                Socket s = new Socket("localhost", PORT)
        ) {
            Chat chat = new Chat("服务端", null, s);
            chat.start();
        } catch (IOException ex) {
            ex.printStackTrace();
        }

    }

}
