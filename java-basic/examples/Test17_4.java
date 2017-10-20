package bitcamp.java100;

public class Test17_4 {

    static void m1(int... values) {
        System.out.printf("아규먼트 개수 : %d\n", values.length);
        for (int v : values) {
            System.out.println(v);
        }
    }
    // ★내부적으로 배열과 같음★

    // static void m2(int...values, int...values2) {} 파라미터 하나만.

    static void m3(String name, int age, int... values) {
    }
    // 일반이랑 가변 같이 쓸때는 일반 파라미터가 앞으로.

    // static void m4(int...values, String name, int age) {} 컴파일 오류!
    // static void m5(String name, int...values, int age) {} 컴파일 오류!

    static void sum(int... values) {
        int s = 0;
        for (int v : values) {
            s += v;
        }
        System.out.printf("합계:%d\n", s);
    }

    public static void main(String[] args) {
        m1();
        m1(1, 2, 3, 4);
        m1(1, 2, 3, 4, 5, 6, 7, 8); // 다른타입 값 노노

        sum();
        sum(1, 2, 3, 4, 5);
        sum(189, 30, 10, 39);
    }
}