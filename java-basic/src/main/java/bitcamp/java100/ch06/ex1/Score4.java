package bitcamp.java100.ch06.ex1;

//생성자
public class Score4 {
    String name;
    int kor;
    int eng;
    int math;
    int sum;
    float aver;

    Score4(String name, int kor, int eng, int math) {
        System.out.println("Score3()호출됨!");
        
        this.name = name;
        this.kor = kor;
        this.eng = eng;
        this.math = math;
        
        this.compute();
    }

    void compute() {
        this.sum = this.kor + this.eng + this.math;
        this.aver = this.sum / 3f;
    }

}