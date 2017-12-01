package bitcamp.java100.ch13.ex7;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;

public class Test1 {

    static void m1(int i) throws Throwable {
        if (i < 0) {
            throw new Throwable();
        }
    }

    static void m2(int i) throws Exception, SQLException, IOException, FileNotFoundException {
        switch (i) {
        case 1:
            throw new Exception();
        case 2:
            throw new SQLException();
        case 3:
            throw new IOException();
        case 4:
            throw new FileNotFoundException();
        }
    }
    
    static void m3(int i) throws Exception{
        switch (i) {
        case 1:
            throw new Exception();
        case 2:
            throw new SQLException();
        case 3:
            throw new IOException();
        case 4:
            throw new FileNotFoundException();
        }
    }
    
    static void m4(int i) throws Throwable {
        switch (i) {
        case 1:
            throw new Exception();
        case 2:
            throw new SQLException();
        case 3:
            throw new IOException();
        case 4:
            throw new FileNotFoundException();
        }
    }
    
    /*static void m4(int i) throws Object {
        switch (i) {
        case 1:
            throw new Exception();
        case 2:
            throw new SQLException();
        case 3:
            throw new IOException();
        case 4:
            throw new FileNotFoundException();
        }
    }
        컴파일 오류*/ 

    public static void main(String[] args) {

    }
}
