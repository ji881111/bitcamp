package bitcamp.java100;

public class Test12_6 {
    public static void main(String[] args){
      
        byte b1=50;
        byte b2=50;
        byte b3;

        b3=100;
        
        /*자바의 최소 연산 단위는 int 임
          (byte나 short메모리 값을 연산할때 int형으로 연산 수행)*/
        
        b3=50+50; //리터럴+리터럴은 결과도 리터럴 그래서ok
        //b3=b1+b2; 컴파일 오류! 변수의 연산결과는 literal이 아님, 허락안함
        //b3=b1+50; 컴파일 오류!
        //변수는 값이 바뀌닌깐 메모리에 값을 저장해야하는지 확신이 안됨.
        
        //byte변수의 연산 결과는 int. 따라서 short변수에 값을 저장안됨.
        short s1;
        //s1=b1+b2; 연산결과 int라서 컴파일 오류!

        //자바로 프로그래밍 할 때 int사용하라!
        //파일의 바이너리 데이터를 다룰 때만 byte메모리 사용한다.        
        //바이너리파일:특정 파일 형식으로 데이터가 저장된 파일
        //전용프로그램필요,메모장에서 안열리는 파일 예)이미지 같은거



    }    
}