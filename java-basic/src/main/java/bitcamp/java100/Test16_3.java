package bitcamp.java100;

public class Test16_3 {
    public static void main(String[] args) {

        int level = 2;
        switch (level){
            case 0 : System.out.println("손님"); break;
            case 1 : System.out.println("회원"); break;
            case 2 : System.out.println("관리자"); break;
            default : System.out.println("유효하지 않은 회원입니다.");
        }
        byte b = 10;
        short s = 10;
        int i = 10;
        char c = 10;
        long l =10;
        float f= 10.f;
        double d = 10;
        boolean bool = true;
        String str = "Hello!";
        
        switch(b) {}
        switch(s) {}
        switch(i) {}
        switch(c) {}
        switch(str) {}
        //switch(l) {}
        //switch(f) {}
        //switch(d) {}
        //switch(bool) {}
        
        System.out.println("----------------------------------------------");
        
        level = 3;
        switch (level){
            case 0 : System.out.println("손님"); 
            case 1 : System.out.println("회원"); 
            case 2 : System.out.println("관리자"); 
            default : System.out.println("유효하지 않은 회원입니다.");
        }
        
        String v1 = "성인";
        switch (v1) {
        case "유아" : 
        case "노인" : System.out.println("무료승차"); break;
        case "어린이" : //break를 만나거나 블록을 나갈때까지 계속 아래로 실행
        case "중학생" :
        case "고등학생" :
        case "미성년" : System.out.println("청소년 요금입니다."); break;
        case "성인" :
        case "외국인" : System.out.println("일반 요금입니다."); break;
        default : System.out.println("요금 계산 대상이 아닙니다.");
        //default는 없어도 됨 선택사항
        }
        
        switch(10) {
        case 10 : System.out.println("10"); //default 없음
        }
        
    }
}