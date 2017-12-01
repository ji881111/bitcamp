package bitcamp.java100.ch15.ex3;

import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Server {

    public static void main(String[] args) throws Exception {

        ServerSocket ss = new ServerSocket(9999); 
        System.out.println("서버실행");
        
        Socket socket = ss.accept();
     
        Scanner in = new Scanner(socket.getInputStream());
        
        String line = in.nextLine();
        
        PrintStream out = new PrintStream(socket.getOutputStream());
        
        out.println(line);
        
        in.close();
        out.close();
        
        socket.close();
        
        ss.close(); // 사용 후 자원을 해제해야함
        System.out.println("서버종료");
    }

}
