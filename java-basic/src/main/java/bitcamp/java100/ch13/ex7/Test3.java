package bitcamp.java100.ch13.ex7;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;

public class Test3 {

    static void m1(int i) throws RuntimeException, Error, ArithmeticException, IndexOutOfBoundsException {
        switch (i) {
        case 1:
            throw new RuntimeException();
        case 2:
            throw new Error();
        case 3:
            throw new ArithmeticException();
        case 4:
            throw new IndexOutOfBoundsException();
        }
    }

    static void m2(int i){
        switch (i) {
        case 1:
            throw new RuntimeException();
        case 2:
            throw new Error();
        case 3:
            throw new ArithmeticException();
        case 4:
            throw new IndexOutOfBoundsException();
        }
    }
    public static void main(String[] args) throws IOException, Exception {
        try {
            m1(2);
        } catch (FileNotFoundException e) {
        } catch (SQLException e) {
        } catch (IOException e) {
        } catch (Exception e) {
        }
        
        try {
            m1(1);
        } catch (Exception e) {
        }
        
        try {
            m1(3);
        } catch (SQLException e) {
        } catch (FileNotFoundException  e) {
        }
    }
}
