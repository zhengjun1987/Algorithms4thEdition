package section11basicalprogrammingmodel;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

/**
 * Author:Zheng Jun
 * E-mail:zhengjun1987@outlook.com
 * Date:2018/5/7 20:07
 * Project:Algorithms4thEdition
 */
public class EchoServer {
    public static void main(String[] args) {
        try {
            ServerSocket serverSocket = new ServerSocket(8189);
            System.out.println(MyUtils.getCurrentTime() + "serverSocket = " + serverSocket);
            Socket socket = serverSocket.accept();
            InputStream inputStream = socket.getInputStream();
            OutputStream outputStream = socket.getOutputStream();
            Scanner scanner = new Scanner(inputStream,"UTF-8");
            PrintWriter printWriter = new PrintWriter(new OutputStreamWriter(outputStream, "UTF-8"),true);
            printWriter.println("Hello!Enter BYE to exit.");

            boolean done = false;
            while (!done && scanner.hasNextLine()){
                String line = scanner.nextLine();
                printWriter.println("Echo:"+line);
                if (line.trim().equalsIgnoreCase("bye")) {
                    done = true;
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
//        192:Algorithms4thEdition zhengjun$ telnet localhost 8189
//        Trying ::1...
//        Connected to localhost.
//        Escape character is '^]'.
//        Hello!Enter BYE to exit.
//        Hello Zheng Jun
//        Echo:Hello Zheng Jun
//        Nice to meet you!
//        Echo:Nice to meet you!
//        BYE
//        Echo:BYE
//        Connection closed by foreign host.

