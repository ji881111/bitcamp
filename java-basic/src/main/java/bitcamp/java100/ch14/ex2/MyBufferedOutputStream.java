package bitcamp.java100.ch14.ex2;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class MyBufferedOutputStream extends FileOutputStream {
    byte[] buf = new byte[8192];
    int len;
    int cursor;

    public MyBufferedOutputStream(String path) throws FileNotFoundException {
        super(path);
    }

    @Override
    public void write(int b) throws IOException {
        if (cursor == buf.length) {// 버퍼가 다채워지면
            this.write(buf);// 채워진 내용을 출력
            cursor = 0;
        }

        buf[cursor++] = (byte) b;
    }

    @Override
    public void flush() throws IOException {// 버퍼에 남아 있는 데이터를 마저 출력함
        this.write(buf, 0, cursor);//버퍼를 쓸때는 꼭 flush를 해줘야함
    }
}
