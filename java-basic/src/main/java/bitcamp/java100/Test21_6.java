package bitcamp.java100;

import java.io.Console;

public class Test21_6 {

    public static void main(String[] args) {

        Console console = System.console();
        int a;
        //int a = 23347651;
        int[] cnt = new int[10];

        a = Integer.parseInt(console.readLine("숫자?"));
        while (a > 0) {
            
            cnt[a % 10]++;
            a /= 10;
        }
        
        int x = 0;
        while(x<cnt.length) {
            System.out.printf("%d = %d\n", x,cnt[x]);
            x++;
        }

    }
}
