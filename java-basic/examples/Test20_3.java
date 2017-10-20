package bitcamp.java100;

import java.io.File;

public class Test20_3 {
    
    static void print1(String value) {
        System.out.println(value);
    }
    
    static void print2(int value) {
        System.out.println(value);
    }
    
    static void print3(float value) {
        System.out.println(value);
    }
    
    static void print4(Object value) { //Object의 레퍼런스는 자바의 모든(클래스)객체(의주소)를 저장할 수 있다.
        System.out.println(value);
    }
    
    public static void main(String[] args) {
        
        print1("문자열");
        print2(300);
        print3(3.14f);
        
        String v1 = "홍길동";
        StringBuffer v2 = new StringBuffer("임꺽정");
        File v3 = new File(".");
        
        print1(v1);
        //print1(v2);
        //print1(v3);
        
        print4(v1);
        print4(v2);
        print4(v3);
        
        print4(100);
        print4(3.14f);
        print4(true);
        
    }
}
