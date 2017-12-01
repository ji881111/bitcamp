package javaTest;

import java.io.FileNotFoundException;
import java.io.RandomAccessFile;

public class FruitSalesMain3 {
    public static void main(String[] args) throws Exception {
        RandomAccessFile raf = new RandomAccessFile("data.bin","r");
        raf.seek(raf.length()-8);
        System.out.println(raf.readDouble());
        raf.close();
        
    }
}
