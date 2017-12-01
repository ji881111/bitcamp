package bitcamp.java100.ch19.ex5;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
public @interface MyAnnotation1 {
    
    //프로퍼티를 선언할때 메소드 처럼 선언해야함
    String[] name();
    int[] age();
}