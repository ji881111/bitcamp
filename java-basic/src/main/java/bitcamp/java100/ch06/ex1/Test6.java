package bitcamp.java100.ch06.ex1;

public class Test6 {
    
    //오버로딩, 생성자 여러개

    public static void main(String[] args) {
        Score5 score;
        
        score = new Score5();
        score = new Score5("임꺽정",100,100,100);
        score = new Score5("유관순");
        
    }
}

