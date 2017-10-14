package bitcamp.java100;

public class Test17_5 {

    static String m1() {
        return "Hello!";
    }
    
    static int m2() {
        return 100;
    }
    
    static boolean m3() {
        return true;
    }
    
    static int m6() {
        return 100;
       //int a = 100;
       //a++;
    }
    //static int m4() {return "hello";} 데이터타입 불일치 컴파일 오류!
    //static int m5() {} 컴파일 오류!
    
    public static void main(String[] args) {
        String v = m1();
        System.out.println(v);
        
        System.out.println(m1()); //반환값을 따로 변수 지정해서 받거나 or 그냥 바로 받거나 or 안받거나
        
        m1();//반환값은 날라가버림,그냥 안받음,버려짐
        
        // String s = m2(); 리턴값은 int인데 String오로 받아서 컴파일 오류
        
        
        
        
    }
}