package bitcamp.java100.ch15.ex1;

import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Server {

    public static void main(String[] args) throws Exception {

        ServerSocket ss = new ServerSocket(9999);
        System.out.println("서버실행");

        Socket socket = ss.accept();

        System.out.println("클라이언트와 연결되었음");
        System.out.printf("서버 IP = %s\n ", socket.getLocalAddress().getHostAddress());
        System.out.printf("서버 Port = %d\n ", socket.getLocalPort());
        System.out.printf("클라이언트 IP = %s\n ", socket.getInetAddress().getHostAddress());//상대편 포트번호 알고 싶으면
        System.out.printf("클라이언트 Port = %d\n ", socket.getPort());

        ss.close(); // 사용 후 자원을 해제해야함
        System.out.println("서버종료");
    }

}
