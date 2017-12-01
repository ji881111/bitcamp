package bitcamp.java100.ch19.ex1;

@MyAnnotation
public class MyClass {
    
    @MyAnnotation
    public int a;
    
    @MyAnnotation
    public void m() {
        
        //@MyAnnotation 일반문장에는 못붙임
        System.out.println("Hello!");
    
    }
    
    public void m2(@MyAnnotation int a, @MyAnnotation String b) {
        
        @MyAnnotation //선언부에는 다 붙일 수 있음
        int x = 10;
        
    }
    
}
