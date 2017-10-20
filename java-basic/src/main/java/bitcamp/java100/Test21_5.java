package bitcamp.java100;

import java.io.Console;

public class Test21_5 {

    public static void main(String[] args) {
        Console console = System.console();
        
        int dan;
        
        while(true) {
            dan = Integer.parseInt(console.readLine("구구단?"));
            if(1 == dan || 9<dan ) {
                System.out.println("2단부터 9단까지만 가능합니다.");
                continue;
            }else if(0>=dan) {
                System.out.println("다음에또봐요");
                break;
            }else {
                for(int i = 1; i<10; i++) {
                    System.out.printf("%d * %d = %d\n",dan,i,(dan*i));
                }
            }
        }
    }
}