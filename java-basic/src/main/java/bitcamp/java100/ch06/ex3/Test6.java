package bitcamp.java100.ch06.ex3;

public class Test6 {
   
   
    
    class A{
        void who () {
            System.out.println("1");
        }
    }
    
    static class B{
        
    }
    public static void main(String[] args) {
        
        Test6 t6 = new Test6();
        
        A obj1;
        
        B obj2;
        
        obj1 = t6.new A();
        obj2 = new B();
        
        obj1.who();
      }
}

