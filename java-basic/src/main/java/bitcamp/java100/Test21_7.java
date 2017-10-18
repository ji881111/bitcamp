package bitcamp.java100;

import java.io.Console;

public class Test21_7 {

    public static void main(String[] args) {

        Console console = System.console();
        
        String a;
        a = console.readLine("문자열?");
        StringBuilder b = new StringBuilder(a);
        System.out.println(b.reverse());
     
        

    }
}
