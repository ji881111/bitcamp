package bitcamp.java100;

public class Test15_5 {
    public static void main(String[] args){
        int a = 10;
        int b = 10;

        a = a + 1;
        b = b - 1;
        System.out.printf("a=%d, b=%d\n",a,b);

        a = 10;
        b = 10;

        ++a;
        --b;
        System.out.printf("a=%d, b=%d\n",a,b);

        a = 10;
        b = 10;

        a++;
        b--; 
        System.out.printf("a=%d, b=%d\n",a,b);

        a = 10;
        b = 10;

        int r1 = ++a;
        int r2 = --b;
        System.out.printf("a=%d, b=%d, r1=%d, r2=%d\n", a,b,r1,r2);

        a = 10;
        b = 10;

        r1 = a++; //변수선언을 위에 했으닌깐
        r2 = b--;
        System.out.printf("a=%d, b=%d, r1=%d, r2=%d\n", a,b,r1,r2);
        
        a = 10;
        a = ++a;
        System.out.println(a);

        b = 10;
        b = b++;
        System.out.println(b);

        a = 5;
        r1 = ++a + ++a * ++a;
        System.out.printf("a=%d, r1=%d\n",a,r1);

        //다른 연산자 보다 ++ --가 우선순위 높음.

        a = 5;
        r1 = a++ + a++ * a++;
        System.out.printf("a=%d, r1=%d\n",a,r1);


    }    
}