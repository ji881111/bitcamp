package bitcamp.java100.ch07.ex4;

public class Test2 {
    
    
    public static void main(String[] args) {
        Test2 obj = new Test2();
        System.out.println(obj.toString());
        
        System.out.println(Integer.toHexString(obj.hashCode()));
        
        Test2 obj2 = new Test2();
        Test2 obj3 = obj;
        
        System.out.println(obj.equals(obj2));
        System.out.println(obj.equals(obj3));
      
        //equals()메서드를 제정의한 대표적인 클래스
        //String, wrapper(Byte,Short,Integer,Long)
        String s1 = new String("Hello");
        String s2 = new String("Hello");
        System.out.println(s1 == s2);
        System.out.println(s1.equals(s2));

        System.out.println("-----------------------------------");
        
        StringBuffer sb1 = new StringBuffer("hello");
        StringBuffer sb2 = new StringBuffer("hello");
        System.out.println(sb1 == sb2);
        System.out.println(sb1.equals(sb2));
        
        
        Class c = obj.getClass();
        System.out.println(c.getName());
        
    }
}