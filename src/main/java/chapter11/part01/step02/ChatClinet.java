package chapter11.part01.step02;

import java.io.*;
import java.net.Socket;
import java.util.Scanner;

import static chapter11.part01.step02.ChatServer.BYE;
import static chapter11.part01.step02.ChatServer.PORT;

/**
 * @author fanbin
 * @date 2019/11/24
 */
public class ChatClinet {

    public static void main(String[] args) {
        withServer();
    }

    private static void withServer() {
        Scanner scanner = new Scanner(System.in);
        try(
                Socket s = new Socket("localhost", PORT);
                BufferedReader br = new BufferedReader(new InputStreamReader(s.getInputStream()));
                PrintWriter pw = new PrintWriter(new OutputStreamWriter(s.getOutputStream()))
        ) {
            while (true) {
                String line = br.readLine();
                if (line.equals(BYE)) {
                    pw.println(BYE);
                    pw.flush();
                    break;
                }
                System.out.println("服务端说：" + line);
                String say = scanner.nextLine();
                pw.println(say);
                pw.flush();
            }
        } catch (IOException ex) {
            ex.printStackTrace();
        }

    }

}
