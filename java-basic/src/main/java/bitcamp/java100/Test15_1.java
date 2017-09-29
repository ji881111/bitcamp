package bitcamp.java100;

public class Test15_1 {
    public static void main(String[] args){
        System.out.printf("10 + 20 = %d\n", 10 + 20);
        System.out.printf("10 - 20 = %d\n", 10 - 20);
        System.out.printf("10 * 20 = %d\n", 10 * 20);
        //연산을 항상 같은 타입끼리만 가능하다.
        //피연사자들이 int일 경우 그결과도 int
        //System.out.printf("5 / 2 = %f\n", 5 / 2); 컴파일 오류
        System.out.printf("5 / 2 = %d\n", 5 / 2);
        //형식문자열(format string) %는 명령어로 사용됨.
        //그냥 %로 사용하려면 %%
        System.out.printf("10 %% 20 = %d\n", 10 % 20);




    }    
}