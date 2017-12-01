package bitcamp.java100.ch12.ex3;

public interface Protocol1 {
    void m1();
    abstract void m2();
    public abstract void m3();
    void m4();
    //void m5() {} 모든 메서드가 추상 메서드이기 때문에 구현 노노 ,컴파일 오류
}
