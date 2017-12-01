package bitcamp.java100.ch14.ex2;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class Test3_4 {
    public static void main(String[] args) throws Exception {


        BufferedInputStream in = new BufferedInputStream(new FileInputStream(new File("sample/j9.pdf")));
        
        
        BufferedOutputStream out = new BufferedOutputStream(new FileOutputStream(new File("sample/j9-4.pdf")));
        

        int b;
        long start = System.currentTimeMillis();
        while ((b = in.read()) != -1) {
            out.write(b);
        }
        out.flush();
        
        long end = System.currentTimeMillis();
        System.out.printf("걸린 시간 = %d\n", (end - start));
        in.close(); //BufferedInputStream close하면 FileInputStream도 close됨
        out.close();
        
        System.out.println("파일  복사 완료했음");
    }
}
