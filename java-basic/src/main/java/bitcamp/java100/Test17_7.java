package bitcamp.java100;

public class Test17_7 {
    
    //ArryList는 상자. 배열처럼 순서대로 . 사이즈 조절 됨. add 사용해서 씀
    static java.util.ArrayList m1() {
        java.util.ArrayList list = new java.util.ArrayList();
        list.add("홍길동");
        list.add(20);
        list.add(false);
        list.add(4.12f);
        list.add('M');
        
        return list;
        
    }
    
    
    public static void main(String[] args) {
      
        java.util.ArrayList a = m1();
        
        for(Object v : a) {
            System.out.println(v);
        }
        
        

    }
}