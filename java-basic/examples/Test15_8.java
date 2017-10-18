package bitcamp.java100;

public class Test15_8 {
    public static void main(String[] args){
        System.out.printf("true & true %b\n", true & true);
        System.out.printf("true & false %b\n", true & false);
        System.out.printf("false & true %b\n", false & true);
        System.out.printf("false & false %b\n", false & false);

        System.out.printf("true | true %b\n", true | true);
        System.out.printf("true | false %b\n", true | false);
        System.out.printf("false | true %b\n", false | true);
        System.out.printf("false | false %b\n", false | false);

        System.out.printf("true && true %b\n", true && true);
        System.out.printf("true && false %b\n", true && false);
        System.out.printf("false && true %b\n", false && true);
        System.out.printf("false && false %b\n", false && false);

        System.out.printf("true || true %b\n", true || true);
        System.out.printf("true || false %b\n", true || false);
        System.out.printf("false || true %b\n", false || true);
        System.out.printf("false || false %b\n", false || false);
        
        boolean b1 = false;
        boolean result = false && (b1 = true);
        System.out.printf("b1=%b, result=%b\n",b1,result);

        b1 = false;
        result = false & (b1 = true); //괄호안에 작업 먼저 실행
        System.out.printf("b1=%b, result=%b\n",b1,result);
       //&한개는 끝까지, &&는 둘이 해서 처음에 false보고 뒤에는 계산도 안함
        
        b1 = false;
        result = true || (b1 = true);
        System.out.printf("b1=%b, result=%b\n",b1,result);
        
        b1 = false;
        result = true | (b1 = true);
        System.out.printf("b1=%b, result=%b\n",b1,result);



        
    }    
}