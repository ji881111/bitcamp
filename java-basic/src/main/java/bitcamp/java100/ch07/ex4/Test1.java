package bitcamp.java100.ch07.ex4;

public class Test1 /* extends Object */ {
    
    

    public static void main(String[] args) {

        Test1 obj = new Test1();

        if (obj instanceof Test1)
            System.out.println("obj는 Test1의 인스턴스이다");

        if (obj instanceof Object)
            System.out.println("obj는 Object의 자손이다");

        Object o1 = new Object();

        if (o1 instanceof Test1)
            System.out.println("1111");
        // Object는 Test1을 상속하지 않았으므로 false
        
        Class c = Test1.class;
        
        Class sc = c.getSuperclass();
        
        System.out.println(sc.getName());
    }

}