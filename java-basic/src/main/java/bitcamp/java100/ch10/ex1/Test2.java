package bitcamp.java100.ch10.ex1;

public class Test2 {
    
    static class A{}
    
    class B{}
    
    //익명클래스
    Object obj = new Object() {
        String name;
        public void m1() {}
    };
    
    public static void main(String[] args) {
        
        //로컬클래스
        class C {}
        
        //익명클래스
        Object obj2 = new Object() {
            String name;
            public void m1() {}
        };
        
        
    }

}
