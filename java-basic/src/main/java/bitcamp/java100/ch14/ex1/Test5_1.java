package bitcamp.java100.ch14.ex1;

import java.io.File;

public class Test5_1 {
    public static void main(String[] args) {
        File file = new File(".");
        
        String[] filenames = file.list(new MyFilenameFilter());
        //패키지 클래스가 외부에 존재함
        for(String name : filenames) {
            System.out.println(name);
        }
            
    }
}

