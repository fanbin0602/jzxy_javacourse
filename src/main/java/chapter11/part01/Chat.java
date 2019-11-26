package chapter11.part01;

import java.io.*;
import java.net.Socket;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

/**
 * @author fanbin
 * @date 2019/11/24
 */
public class Chat {

    public static final int PORT = 54321;
    public static final Charset CHARSET = StandardCharsets.UTF_8;
    public static final String BYE = "bye";

    private String from;
    private String greeting;
    private Socket s;

    public Chat(String from, String greeting, Socket s) {
        this.from = from;
        this.greeting = greeting;
        this.s = s;
    }

    public void start() {
        Scanner scanner = new Scanner(System.in);
        try (
                BufferedReader br = new BufferedReader(new InputStreamReader(s.getInputStream()));
                PrintWriter pw = new PrintWriter(new OutputStreamWriter(s.getOutputStream()))
        ){
            if (greeting != null) {
                pw.println(greeting);
                pw.flush();
            }
            while (true) {
                String line = br.readLine();
                if (line.equals(BYE)) {
                    pw.println(BYE);
                    pw.flush();
                    break;
                }
                System.out.println(from + "说：" + line);
                String say = scanner.nextLine();
                pw.println(say);
                pw.flush();
            }
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}
