package bitcamp.java100.ch08.ex7;

public class B2 extends B{
    
    //void m1(int a, String s) {}
    //protected void m1(int a, String s) {}
    //public void m1(int a, String s) {}
    //void m1(int x, String y) {} ok 파라미터명은 달라도 됨
    
    //int m1(int a, String s) {} 리턴타입 불일치, 컴파일 오류!
    void m1_1(int a, String s) {} //새 메서드 추가 한 것.
    void m1(String a, String s) {} //파라미터 타입이 다르면 새메서드 추가한 것! 오버로딩
    void m1(String s, int a) {} //파라미터의 순서가 다르면 새메서드 추가 한 것! 오버로딩
    void m1(int a ) {} //파라미터의 개수가 다르면 새메서드 추가한 것. 오버로딩
}
