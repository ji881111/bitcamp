package bitcamp.java100.ch07.ex5;

public class A {
   /* A(){
        super(); //Object기본 생성자 호출
    }
   */
    
    A(){
        System.out.println("A() 생성자 실행");
    }
    
    A(String str){
        super();
        System.out.println("A(String) 생성자 실행");
    }
    
    A(int i){
        System.out.println("A(int) 생성자 실행");
        //super(); 첫번째 문장이 아니면 컴파일 오류
    }
  
}


