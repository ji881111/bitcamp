package bitcamp.java100;

public class Test17_19 {

   static class My {
        int value;

        void print() {
            System.out.println(this.value);
        }
    }

    public static void main(String[] args) {
        My r1 = new My();
        My r2 = new My();
        My r3 = new My();

        r1.value = 100;
        r2.value = 200;
        r3.value = 300;
        
        //My.print(); 인스턴스 메서드는 클래스 이름으로 호출 노노. 인스턴스 메서드 호출할때는 인스턴스 주소를 앞에.
        r1.print();
        r2.print();
        r3.print();
        
        /* My m4 = null;
           m4.print(); exception NullPointerException 실행중 오류 */
        
        //String s1 = "hello";
        //s1.print(); 인스턴스랑 다른 타입 호출 안됨. 
              
        
        
        

    }
}
