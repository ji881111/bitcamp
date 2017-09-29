package bitcamp.java100;

public class Test13_3 {
    public static void main(String[] args){
        
        int[] arr1;
        arr1=new int[3];
        //모든 배열 레퍼런스에는 length라는 내부 변수를 갖고 있다.
        System.out.println(arr1.length);
        //레퍼런스 변수를 통해 사용하는 내부변수를 프로퍼티(property)
    
        arr1[0]=100;
        arr1[1]=90;
        arr1[2]=80;
        //인덱스 범위 벗어나면 java.lang.ArrayIndexOutOfBoundsExceotion예외발생
        //컴파일은 됨, 실행 안됨

        
   
   
   
   
    }    
}