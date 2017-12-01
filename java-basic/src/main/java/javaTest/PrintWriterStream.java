package javaTest;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class PrintWriterStream {
    public static void main(String[] args) throws IOException {
        PrintWriter out = new PrintWriter(new FileWriter("Printf.txt"));
        
        out.printf("제 나이는 %d살 입니다", 24);
        out.println("");
        
        out.println("저는 자바가 좋습니다.");
        out.print("특히, I/O 부분에서 많은 매력을 느낍니다.");
        out.close();
        
    }
    
}
