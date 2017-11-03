package bitcamp.java100.ch08.ex7;

public class A2 extends A {

    public void test1() {
        m4();
        m3();
        m2();
        // m1(); private 멤버는 그 클래스만 사용가능, 컴파일 오류

    }
    //오버라이딩 아님, 그냥B클래스에 새로 추가한 메서드
    private void m1() {
        System.out.println("B.m1()");
    }
    
    void m2() {}
    
    protected void m3() {}
    
    public void m4() {}
    
    
    

}
