package bitcamp.java100;

import java.io.Console;
import java.util.ArrayList;

public class Test21_8_1 {

    static class Person{
        String name,email,phone;
        
        void showInfo() {
            System.out.printf("%s %s %s\n",name,email,phone);
        }
    }
    
    public static void main(String[] args) {
        ArrayList<Person> a = new ArrayList<Person>();
        Console c = System.console();
        
        while(true) {
        System.out.println("=====정보입력=====");
        Person p = new Person();
        p.name = c.readLine("이름 :");
        p.email = c.readLine("이메일 :");
        p.phone = c.readLine("전화번호 :");
        a.add(p);
        System.out.println("저장하였습니다.");
        
        char yesno = c.readLine("계속하시겠습니까? (Y/N):").charAt(0);
        if(yesno == 'y' || yesno == 'Y')
            continue;
        else
            break;
        } 
        
        System.out.printf("\n\n%-4s %-15s %-10s\n","이릅","이메일","전화번호");
        for(Person p : a) {
            p.showInfo();
        }
    }
}
