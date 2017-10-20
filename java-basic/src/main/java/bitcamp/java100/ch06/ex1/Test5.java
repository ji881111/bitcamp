package bitcamp.java100.ch06.ex1;

public class Test5 {

    public static void main(String[] args) {
        Score4 score;
        
        score = new Score4("홍길동",100,80,70);
        
        System.out.printf("이름 = %s\n", score.name);
        System.out.printf("총점 = %s\n", score.sum);
        System.out.printf("평균 = %f\n", score.aver);
        
        
    }
}

