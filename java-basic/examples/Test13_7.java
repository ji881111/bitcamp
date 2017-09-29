package bitcamp.java100;

public class Test13_7 {
    public static void main(String[] args){
   
        int a =100;
        int b;
        
        b=a; //a의 값을 b에 저장
        b=200; //a와b는 다른 메모리기때문에 a는 영향안받음

        System.out.printf("a=%d, b=%d\n",a,b);

        int[] arr1 ={100,200,300};
        int[] arr2;

        arr2=arr1; //arr1에 있는 주소를 arr2에 저장한다.
        arr2[1]=50;
        System.out.printf("%d,%d,%d\n",arr1[0],arr1[1],arr1[2]);
        //참조변수를 통해 접근하면 값을 직접 변경 가능

        





        
   
    }    
}