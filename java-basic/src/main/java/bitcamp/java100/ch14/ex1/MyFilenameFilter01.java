package bitcamp.java100.ch14.ex1;

import java.io.File;
import java.io.FilenameFilter;

public class MyFilenameFilter01 implements FilenameFilter {

    @Override
    public boolean accept(File dir, String name) {
        
        try {
        System.out.println(dir.getCanonicalPath() + ",");
        System.out.println(name);
        }catch(Exception e) {}
        return true;
        //true 리턴 : 그파일에 리턴 배열 포함
        
    }

}
