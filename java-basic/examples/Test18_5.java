package bitcamp.java100;

public class Test18_5 {
    
    public static void main(String[] args) throws Exception{
        
        String s1 = "ABC가각간";
        
        String s2 = s1.replace("BC", "하하하");
        System.out.println(s1);
        System.out.println(s2);
        
        System.out.println(s1.charAt(4)); //0부터 시작
        
        s1 = "ABBCDEBBFGH";
        System.out.println(s1.indexOf("BB"));//찾은 문자열의 인덱스 반환  //앞
        System.out.println(s1.lastIndexOf("BB"));//뒤
        
        System.out.println(s1.substring(3));
        System.out.println(s1.substring(3,6));
        
        s1 = "홍길동";
        
        System.out.println(s1.startsWith("홍길"));
        System.out.println(s1.startsWith("길"));
        
        System.out.println(s1.endsWith("동"));
        System.out.println(s1.endsWith("원  "));
        
        s1 = "홍길동,유관순,임꺽정,안중근,윤봉길,이육사,윤동주";
        
        System.out.println(s1.contains("꺽정"));
        System.out.println(s1.contains("김꺽정"));
        
        String s3 = "ABC";
        String s4 = "가각간";
        
        System.out.println(s3.concat(s4)); //s3,s4값은 변하지 않음
        System.out.println(s3); //기존 String은 변하지 않음
        System.out.println(s4);
        
        s3 = new String("탕수육");
        s4 = new String("탕수육2");
        String s5 = new String("탈수육");
        String s6 = new String("탕수육");
        
        System.out.println(s3.compareTo(s6));
        System.out.println(s3.compareTo(s4));
        System.out.println(s3.compareTo(s5));
        
        s1 = "홍길동";
        s2 = "";
        s3 = null;
        

        System.out.println((s1.isEmpty()));
        System.out.println((s2.isEmpty()));
        //System.out.println((s3.isEmpty())); NullPointException
        //빈문자열과 인스턴스 없음은 다르다.
        
        System.out.println(s1.length());
        System.out.println(s2.length());
        //System.out.println(s3.length()); NullPointException
        
        s1 = "홍길동,유관순,임꺽정,안중근,윤봉길,이육사,윤동주";
        
        String[] arr = s1.split(","); //,로 구분해서 자르고 String[]배열로 리턴
        for(String s : arr) {
            System.out.println(s);
            System.out.println("-");
        }
        System.out.println();
        
        arr = s1.split(" "); //해당 문자열에 구분자가 없다면 그냥 통으로
        System.out.println(arr.length);
        System.out.println(arr[0]);
        
        //빈문자열도 문자열이므로 배열로 리턴
        s1 = "";
        arr = s1.split(",");
        System.out.println(arr.length);
        System.out.println(arr[0]);
        
        
        s1 = "Hong Gil Dong";
        System.out.println(s1.toLowerCase());
        System.out.println(s1.toUpperCase());//새로운 인스턴스 주소가 놓여짐.원래는 안바뀜.
        
        s1 = "  \t홍 \t길 동 \n입니다.\n\n\n\t\n"; 
        System.out.print(">");
        System.out.print(s1.trim());
        System.out.println("<");
        //trim은 스페이스를 날리는게 아니라 공백(white space)제거
        
        s1 = "ABC\n가각간\n똘똠똥";
        
        byte[] bytes = s1.getBytes();
        for(byte b : bytes) {
            System.out.print(Integer.toHexString(b & 0x00ff));
            System.out.print(" ");
        }
        System.out.println();
        
        //★ getByte(문자집합) os에 상관없이 동일한 결과
        bytes = s1.getBytes("UTF-8");
        for(byte b : bytes) {
            System.out.print(Integer.toHexString(b & 0x00ff));
            System.out.print(" ");
        }
        System.out.println();
        
        
        s1 = String.valueOf(true);
        s2 = String.valueOf(3.14);
        s3 = String.valueOf(100);

        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3); //s1,s2,s3 다 문자열
        
        s1 = "ABC";
        s2 = "가각간";
        s3 = s1+s2;
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
        
        
        
    }
}
