package bitcamp.java100.ch06.ex1;

//생성자에서 다른 생성자 호출
public class Score7 {
    String name;
    int kor;
    int eng;
    int math;
    int sum;
    float aver;

    Score7() {
        
        this("홍길동"); //밑에 생성자 호출
       /* this.name = "홍길동";
        this.kor = 50;
        this.eng = 50;
        this.math = 50;

        this.compute();*/
    }

    Score7(String name) {
        
        this(name, 50, 50, 50); //밑에 생성자 호출
        /*
         * this.name = name; this.kor = 50; this.eng = 50; this.math = 50;
         * 
         * this.compute();
         */
    }

    //최종 호출되는 생성자, 생성자 끼리만 생성자 호출할 수 있음.
    Score7(String name, int kor, int eng, int math) {
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
