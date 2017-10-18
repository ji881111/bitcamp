package bitcamp.java100;

import java.util.Scanner;

public class Test21_1 {
    
    public static void main(String[] args) {
        
        Scanner keyScan = new Scanner(System.in);
        
        System.out.println("입력하세요 : ");
        String line = keyScan.nextLine();
        System.out.println(line);
        //사용 후 닫는다.
        
        
        keyScan.close();
    }
}
