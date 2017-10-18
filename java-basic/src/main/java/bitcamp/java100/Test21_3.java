package bitcamp.java100;

import java.io.Console;

public class Test21_3 {
    
    public static void main(String[] args) {
        
       Console console = System.console();
       
       if(console == null) {
           System.err.println("콘솔을 지원하지 않습니다.");
           System.exit(1); //JVM종료
       }
       
       String name;
       int age;
       boolean working;
       float gpa;
       
       name = console.readLine("이름 : ");
       age = Integer.parseInt(console.readLine("나이 : ")); 
       working = Boolean.parseBoolean(console.readLine("재직여부 : "));
       gpa = Float.parseFloat(console.readLine("졸업학점 : ")); 
       
       System.out.println("--------------------------------");
       
       System.out.printf("이름:%s\n",name);
       System.out.printf("이름:%s\n",age);
       System.out.printf("이름:%s\n",working);
       System.out.printf("이름:%s\n",gpa);
       
    }
}
