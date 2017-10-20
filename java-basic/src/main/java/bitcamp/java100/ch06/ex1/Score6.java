package bitcamp.java100.ch06.ex1;

//생성자
public class Score6 {
    String name;
    int kor;
    int eng;
    int math;
    int sum;
    float aver;
    
    //자동으로  public생성자 생성
    //Score6() {
      //  System.out.println("기본생성자 호출"); 
    //}

    
    void compute() {
        this.sum = this.kor + this.eng + this.math;
        this.aver = this.sum / 3f;
    }

}
