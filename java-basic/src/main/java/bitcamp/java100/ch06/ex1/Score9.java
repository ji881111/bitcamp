package bitcamp.java100.ch06.ex1;

//this 생략
public class Score9 {
    String name;
    int kor;
    int eng;
    int math;
    int sum;
    float aver;
  
    {
      System.out.println("인스턴스 초기화블럭 실행");  
    }
    
    {
        System.out.println("인스턴스 초기화블럭 실행2");  
      }
    
    
    Score9(){
        System.out.println("Score9()기본생성자 호출됨");
    }

    Score9(String name){
        System.out.println("Score9(String)기본생성자 호출됨");
    }
    
    {
        System.out.println("인스턴스 초기화블럭 실행3");  
      }
    


    void compute() {
        this.sum = this.kor + this.eng + this.math;
        this.aver = this.sum / 3f;
    }

}
