package bitcamp.java100.ch14.ex2;

import java.io.IOException;
import java.io.InputStream;

//FileInputStream 대신 다른것도 쓸 수 있으므로 우회 하는것
public class MyBufferedInputStream2 {
    InputStream worker;
    
    byte[] buf = new byte[8192];
    int len;
    int cursor;

    public MyBufferedInputStream2(InputStream in) {
        this.worker = in;
    }
    
   
    public int read() throws IOException {
        if(cursor >= len) {//버퍼가 비었으면 다시 버퍼를 채운다
            cursor = 0;
            len = worker.read(buf);
            if(len == -1) //더이상 읽을 데이터가 없다면
                return -1;
           
        }
        
        return buf[cursor++] & 0x000000FF;
    }
    
    
    
    
    
    
    
    
}
