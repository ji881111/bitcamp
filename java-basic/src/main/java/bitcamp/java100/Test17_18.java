package bitcamp.java100;

public class Test17_18 {

    static class My {
        int value;

        static void print(My ref) {
            System.out.println(ref.value);
        }
    }

    public static void main(String[] args) {
        My r1 = new My();
        My r2 = new My();
        My r3 = new My();

        r1.value = 100;
        r2.value = 200;
        r3.value = 300;
        
        My.print(r1);
        My.print(r2);
        My.print(r3);
        
        //r1.print(r1); 클래스메소드는 클래스메소드로 호출하는게 좋음
        //클래스 메소드는 this라는 내장 변수가 없음.
        

    }
}
