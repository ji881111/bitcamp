package bitcamp.java100;

public class Test12_7 {
    public static void main(String[] args){
      
        float f1;
        f1=9876567f;
        System.out.println(f1);

        f1=9876543456789l;//8바이트 정수를 4바이트 실수에 저장 but값이 잘림
        System.out.println(f1);

        //f1=9876543.4567; 컴파일 오류!
        f1=9876543.4567F; //값이 잘림

        //실수는 근사값이므로 정수를 실수에 저장 하지 말것.

    }    
}