package bitcamp.java100.ch06.ex1;

//this 생략
public class Score8 {
    String name;
    int kor;
    int eng;
    int math;
    int sum;
    float aver;

    Score8(String name) {
        this.name = name; 
        
        kor = 50; //this 없으면 로컬 변수 부터 찾고 인스턴스 변수인지 찾아보고  인스턴스변수에 있으면 컴파일러가 this자동으로 붙임
        eng = 50; //인스턴스 변수가 아니면 컴파일 오류
        math = 50;
        
        compute();

    }

    void compute() {
        this.sum = this.kor + this.eng + this.math;
        this.aver = this.sum / 3f;
    }

}
