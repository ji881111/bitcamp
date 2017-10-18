package bitcamp.java100;

public class Test18_1 {
    
    public static void main(String[] args) {
        
        String s1;
        s1 = new String("ABC가각간");
        
        String s2 = new String("ABC가각간");
        
        if(s1 != s2)
            System.out.println("s1 != s2");
        //인스턴스가 다르므로 주소도 다름.
        
    }
}
