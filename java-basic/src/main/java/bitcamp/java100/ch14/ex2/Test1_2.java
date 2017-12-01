package bitcamp.java100.ch14.ex2;

import java.io.FileInputStream;

public class Test1_2 {
    public static void main(String[] args) throws Exception {

        FileInputStream in = new FileInputStream("Sample/j9.pdf");

        byte[] buf = new byte[8000];
        int len = 0; //읽어 온 바이트의 개수
        //int b = 0;
        int count = 0;
        
        long start = System.currentTimeMillis();
        
        while ((len = in.read(buf)) != -1) {
            count+=len;
        }
        
        long end = System.currentTimeMillis();
        System.out.printf("읽은 바이트 수 = %d\n", count);
        System.out.printf("걸린 시간 = %d\n", (end - start));
        
        in.close();
    }
}
