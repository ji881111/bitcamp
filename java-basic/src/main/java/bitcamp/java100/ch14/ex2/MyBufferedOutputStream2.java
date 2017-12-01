package bitcamp.java100.ch14.ex2;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.OutputStream;
//상속이 아닌 위임을 통한 기능 확장
public class MyBufferedOutputStream2 {
    OutputStream worker; //실제 일할놈
    
    byte[] buf = new byte[8192];
    int len;
    int cursor;

    public MyBufferedOutputStream2(OutputStream worker) {
        this.worker = worker;
    }

    public void write(int b) throws IOException {
        if (cursor == buf.length) {// 버퍼가 다채워지면
            worker.write(buf);// 채워진 내용을 출력, worker야 출력해
            cursor = 0;
        }

        buf[cursor++] = (byte) b;
    }

    public void flush() throws IOException {// 버퍼에 남아 있는 데이터를 마저 출력함
        worker.write(buf, 0, cursor);//버퍼를 쓸때는 꼭 flush를 해줘야함
        cursor = 0;
    }
}
