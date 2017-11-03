package bitcamp.java100.ch08.ex8;

public class Test1 {
    
    static int divide(int a, int b) {
        return a / b;
    }

    static float divide(float a, float b) {
        return a / b;
    } //float > int 노노, 이거 없으면 컴파일 오류
    
    
    public static void main(String[] args) {
        System.out.println(divide(7,2));
        System.out.println(divide(7f,2f));
        
        System.out.println(divide(7,2f));
        System.out.println(divide(7f,2));
     
    }
}
