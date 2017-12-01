package bitcamp.java100.ch11.ex6;

public abstract class C {
    int v1;
    
    public void m1() {
        System.out.println("C.m1()");
    }
    
    public abstract void m2(); //추상메서드는 추상클래스만이 가질 수 있다.

}
