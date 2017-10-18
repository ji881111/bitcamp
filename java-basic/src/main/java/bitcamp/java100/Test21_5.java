package bitcamp.java100;

import java.io.Console;

public class Test21_5 {

    public static void main(String[] args) {

        Console console = System.console();

        int dan;


        while(true) {
            dan = Integer.parseInt(console.readLine("구구단?"));

            if(dan>9) {
                System.out.println("2단에서 9단까지만 가능합니다.");
                continue;
            }else if(dan<1) {
                System.out.println("종료");
                break;
            }else {

                for(int i=1; i<10; i++ ) 
                    System.out.println(dan + "*" +i+"="+dan*i+" ");
            }

        }
    }
}