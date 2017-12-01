package bitcamp.java100.ch14.ex1;

public class Test8_3 {

    static int f(int n) {
        if (n == 0)
            return 0;
        return n + f(n - 1);
    }

    public static void main(String[] args) throws Exception {
        System.out.println(f(10));
    }
}//반복문이 재귀보다 메모리 적게 씀 , 반복문은 스택 하나만 쓰고 재귀는 스택을 계속 생성
