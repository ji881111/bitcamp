package bitcamp.java100.ch12.ex3;

public interface Protocol2 {
    public static final float PI = 3.14159f;
    static final int AA = 100;
    final int BB = 200;
    int CC = 300; //== public static final int CC
    //생략하면 컴파일러가 자동으로 public static final을 붙인다.
    //private int DD = 400; //컴파일 오류. 규칙은 공개되어야 하닌깐
}
