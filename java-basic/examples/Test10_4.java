package bitcamp.java100;

public class Test10_4 {
    public static void main(String[] args){
       
        //printf()
        //formatter.format("%4$2s %3$2s %2$2s %1$2s", "a", "b", "c", "d")\
        //문자열 형식
        //%[argument_index$][flags][width][.precision]conversion
        //대괄호는 올수도 있고 안올수도 있고
        System.out.printf("%4$2s, %3$3s, %2$4s, %1$2s\n", "a", "b", "c", "d");
        //%s : 문자열 값 넣기
        //번호$ : 값의 인덱스, 지정안하면 순서대로 
        //예)4$ : 4번째 값
        //%자릿수s : 문자열 출력할때 차지할 칸 수 빈자리는 공백 
        //(위에서는 2같은거)
        System.out.printf("%4$2s, %3s, %4s, %2s\n", "a", "b", "c", "d");
        //%s,%S : 문자열 값 넣기
    
        System.out.printf("%s,%d,%o,%x,%h,%f,%b,%tY\n","홍길동",100,100,100,100,3.14,true,new java.util.Date());

        System.out.printf("%f,%.1f,%.2f,%.3f,%.4f,%.5f\n",3.141592,3.141592,3.141592,3.141592,3.141592,3.141592);
        
        //[argument_index$] 똑같은 값을 다르게 보이고 싶을때
        //1$ 첫번째 값을 사용해서
        System.out.printf("%1$f,%1$.1f,%1$.2f,%1$.3f,%1$.4f,%1$.5f\n",3.141592);
        
        //[width]
        System.out.printf("%1$4s,%1$10s,%2$5.2f,%2$10.3f\n","홍길동",3.14);

        //[flags] -:왼쪽정렬, 기본이 오른쪽 정렬임
        //        +:부호출력
        System.out.printf("'%10s','%-10s'\n","홍길동","임꺽정");
        System.out.printf("%d,%+d\n",100,100);
        
        //%자릿수, 0은 공백에 0으로 채움
        System.out.printf("%5d,%05d\n",123,123);

        //날짜
        System.out.printf("%1$tH,%1$tI,%1$tM,%1$tS,%1$tp\n",new java.util.Date());

        System.out.printf("%1$tH:%1$tM:%1$tS\n",new java.util.Date());

        System.out.printf("%1$tm,%1$tB,%1$tb\n",new java.util.Date());

        System.out.printf("%1$tA,%1$ta\n",new java.util.Date());
    }
    
}