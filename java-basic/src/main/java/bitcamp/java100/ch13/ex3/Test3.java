package bitcamp.java100.ch13.ex3;

import java.io.FileReader;

public class Test3 {

    public static void main(String[] args) {
        class MyClass {}
        class MyClass2 implements AutoCloseable {

            @Override
            public void close() throws Exception {
                System.out.println("close() 호출되었음");
            }
        }

        try ( // MyClass obj = new MyClass(); 컴파일 오류!
                MyClass2 obj = new MyClass2();
            ) {
            System.out.println("try 블록 실행");
            
            int r = 20 / 0; //0으로 나누는 예외발생 
            //예외 발생해서 catch로 가는데 try벗어나면 바로 close()실행
        } catch (Exception e) {
            System.out.println("catch블록 실행");

        }

    }
}
