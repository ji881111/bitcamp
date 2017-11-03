package bitcamp.java100.ch06.ex2;

import java.io.Console;

public class MessageBox {
    
    static boolean confirm(String message) {
        Console console = System.console(); //현재 자바머신의 콘솔 리턴, 콘솔은 하나
        
        String response = console.readLine(message).toLowerCase();
        if(response.equals("y") || response.equals("yes")) {
            return true;
        }
        return false;
    }
}
