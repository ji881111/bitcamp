package bitcamp.java100;

public class Test14_3 {
    public static void main(String[] args){
        
        class student {
            String name, address, phone;
            int birth;
        }
        
        student info = new student();
        
        info.name = "황지은";
        info.birth = 880117;
        info.phone = "010-9447-0775";
        info.address = "서울시 송파구";


        System.out.printf("%s %d %s %s\n",info.name, info.birth, info.phone, info.address);
        





        
   
    }    
}