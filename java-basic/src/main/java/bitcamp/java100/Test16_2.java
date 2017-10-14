package bitcamp.java100;

public class Test16_2 {
    public static void main(String[] args) {

        int age = 17;

        if (age <= 19)
            System.out.println("미성년");
        else
            System.out.println("성년");

        age = 68;
        if (age > 65)
            System.out.println("경로우대 대상자 입니다.");

        System.out.println("----------------------------------------");

        age = 27;
        if (age <= 19)
            System.out.println("미성년입니다."); // 블록으로 묶지 않으면 첫번째 한문장 if문에 소속됨
        System.out.println("청소년 할인을 받을 수 있습니다.");

        System.out.println("----------------------------------------");

        age = 17;
        if (age <= 19) {
            System.out.println("미성년입니다.");
            System.out.println("청소년 할인을 받을 수 있습니다.");
        } // if문안에 여러 문장 넣기위해서는 블록으로 묶어 줘야함

        System.out.println("----------------------------------------");

        age = 1;
        if (age <= 19)
            if (age > 13)
                System.out.println("청소년"); // 세미콜론 만나면 한문장임

        System.out.println("----------------------------------------");

        age = 27;
        if (age <= 19)
            if (age > 13)
                System.out.println("청소년");
            else
                System.out.println("성년"); // 이미 밖 if문에서 거짓이 되서 출력 안됨

        System.out.println("----------------------------------------");

        age = 27;
        if (age <= 19) {
            if (age > 13)
                System.out.println("청소년");
        } // 이렇게 블록으로 else를 분리
        else
            System.out.println("성년");

        System.out.println("----------------------------------------");

        age = 13;
        if (age <= 19)
            if (age > 13)
                System.out.println("청소년");
            else
                System.out.println("어린이 또는 유아");
        // if else는 한문장, else는 if없이 사용할 수 없으므로

        System.out.println("----------------------------------------");

        age = 25;
        if (age <= 19)
            if (age > 13)
                System.out.println("청소년");
            else
                System.out.println("어린이 또는 유아");
        else
            System.out.println("성년입니다.");

        System.out.println("----------------------------------------");

        age = 25;
        if (age <= 19)
            if (age > 13)
                System.out.println("청소년");
            else
                System.out.println("어린이 또는 유아");
        else if (age < 65)
            System.out.println("성년입니다.");
        else
            System.out.println("노인입니다.");

        age = 25;
        if (age <= 19) {
            if (age > 13)
                System.out.println("청소년");
            else
                System.out.println("어린이 또는 유아");
        } 
        else {
            if (age < 65)
                System.out.println("성년입니다.");
            else
                System.out.println("노인입니다.");
        }
        
        System.out.println("----------------------------------------");
        
        age = 22;
        if (age < 8)
            System.out.println("유아");
        else
            if(age < 14)
                System.out.println("어린이");
            else
                if(age < 20)
                    System.out.println("청소년");
                else
                    if(age <65)
                        System.out.println("성년");
                    else    
                        System.out.println("노인");
         
        System.out.println("----------------------------------------");
        
        age = 22;
        if (age < 8)
            System.out.println("유아");
        else if (age < 14)
            System.out.println("어린이");
        else if (age < 20)
            System.out.println("청소년");
        else if (age < 65)
            System.out.println("성년");
        else
            System.out.println("노인");
        
        System.out.println("----------------------------------------");
        
        age = 22;
        if (age < 8) {
            System.out.println("유아");
        }else if (age < 14) {
            System.out.println("어린이");
        }else if (age < 20) {
            System.out.println("청소년");
        }else if (age < 65) {
            System.out.println("성년");
        }else {
            System.out.println("노인");
        }//중괄호 권고사항

    }
}