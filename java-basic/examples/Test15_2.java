package bitcamp.java100;

public class Test15_2 {
    public static void main(String[] args){
        byte b1 = 10;
        byte b2 = 20;

        //int형 임시 메모리가 만들어져서 연산함. 결과도 int형
        //byte b3 = b1 - b2; 컴파일 오류!
        short s1 = 10;
        short s2 = 20;
       //short s3 = s1 + s2; 연산결과 int형, 컴파일 오류!
       
       int r = s1 + s2;
       long r2 = s1 +s2; //연산결과보다 큰자료형은 ok.

       



    }    
}