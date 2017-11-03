package bitcamp.java100.ch08.ex7;

public class C3 extends C2{
    
    @Override
    void m1() {
        System.out.println("C3.m1()");
    }
    
    @Override
    void m3() {
        System.out.println("C3.m3()");
    }
    
    void test1() {
        this.m2();
        super.m2();
    
    }
    
    public static void main(String[] args) {
        C3 obj = new C3();
        obj.test1();
    }
    
}
