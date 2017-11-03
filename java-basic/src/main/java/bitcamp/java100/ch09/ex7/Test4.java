package bitcamp.java100.ch09.ex7;

import java.util.HashSet;

public class Test4 {

    public static void main(String[] args) {

        HashSet<String> set = new HashSet<>();
        
        String s1 = "홍길동";
        String s2 = "임꺽정";
        String s3 = "유관순";
        
        set.add(s1);
        set.add(s2);
        set.add(s3);
        
        String s4 = new String("홍길동");
        String s5 = new String("홍길동");
        
        System.out.println(s1 == s4);
        System.out.println(s1 == s5);
        System.out.println(s4 == s5);
        //다 다른 객체(인스턴스)
        
        System.out.println(s1.hashCode());
        System.out.println(s4.hashCode());
        System.out.println(s5.hashCode());
        //s1, s4, s5 해시값은 같다.
        
        System.out.println(s1.equals(s4));
        System.out.println(s1.equals(s5));
        System.out.println(s4.equals(s5));
        //equals 는 다 true(String 오버라이딩)
        
        
        set.add(s4);
        set.add(s5);
        // ★인스턴스값은 다르지만 해시코드의 리턴값과 equals의 값이 같아서 같은것으로 판단,
        //★중복 저장 안함.
        
        System.out.println(set.size());
        
        String[] arr = new String[set.size()];
        set.toArray(arr);

        for(String s : arr) {
           System.out.printf("%s ",s);
        }
        System.out.println();
       
    }
}