package bitcamp.java100;

import java.io.Console;

public class Test21_4 {
    
    public static void main(String[] args) {
        
       class Student{
           String name;
           int age;
           boolean working;
           float gpa;
           
       }
        
       Console console = System.console();
       
       if(console == null) {
           System.err.println("콘솔을 지원하지 않습니다.");
           System.exit(1); //JVM종료
       }
       
       Student s = new Student();
       
       s.name = console.readLine("이름 : ");
       s.age = Integer.parseInt(console.readLine("나이 : ")); 
       s.working = Boolean.parseBoolean(console.readLine("재직여부 : "));
       s.gpa = Float.parseFloat(console.readLine("졸업학점 : ")); 
       
       System.out.println("--------------------------------");
       
       System.out.printf("이름:%s\n",s.name);
       System.out.printf("이름:%s\n",s.age);
       System.out.printf("이름:%s\n",s.working);
       System.out.printf("이름:%s\n",s.gpa);
       
    }
}
