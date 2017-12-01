package bitcamp.java100.ch14.ex2;

import java.io.FileOutputStream;

public class Test2_6 {
    public static void main(String[] args) throws Exception {
        int[] data = new int[4000000];
        
        for(int i = 0; i<data.length; i++) {
            data[i] = (int)(Math.random() * 100000);
        }
        
        FileOutputStream out = new FileOutputStream("./test3.dat");
        MyBufferedOutputStream out2 = new MyBufferedOutputStream(out);
        
        

        long start = System.currentTimeMillis();
        for(int b : data) {
            out2.write(b);
        }
        
        out2.flush();//남은 찌꺼기 출력
        
        long end = System.currentTimeMillis();
        System.out.printf("걸린 시간 = %d\n", (end - start));
        
        out.close();
    }
}
