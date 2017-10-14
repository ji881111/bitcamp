package bitcamp.java100;

public class Test15_12_2 {
    public static void main(String[] args){
        
        int v = 1234567890;
        
        //0000 0000 0000 0000 0000 0000 1111 1111
        System.out.println(Integer.toHexString(v));
        System.out.println(Integer.toHexString(v >> 24));
        System.out.println(Integer.toHexString(v >> 16));
        System.out.println(Integer.toHexString((v >> 16)& 0xff));
        System.out.println(Integer.toHexString((v >> 8)& 0xff));
        System.out.println(Integer.toHexString(v& 0xff));
    }    
}