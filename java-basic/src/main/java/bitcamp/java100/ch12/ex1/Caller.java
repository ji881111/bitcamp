package bitcamp.java100.ch12.ex1;

public class Caller {
    public static void main(String[] args) {
        Protocol obj = new Callee();
        //Protocol obj2 = new String(); protocol이라는 인터페이스 규칙에 따라 클래스를 만들지 않아서 컴파일 오류!
        
        obj.m1();
        obj.m2();
    }
}
