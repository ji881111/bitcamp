package bitcamp.java100;

public class Test17_3 {
    
    static void m1(String name) {
        System.out.printf("%s님 반갑습니다.\n", name );
    }// name 외부에서 들어오는 값을 받는 변수, 파라미터. 매개변수
    
    static void m2(String name, int age) {
        System.out.printf("%s(%d)님 반갑습니다.\n", name, age);
    }
    
    public static void main(String[] args) {
        m1("홍길동"); //메서드 호출할때 넘기는값 아규먼트
        m2("임꺽정",10);
    }
}