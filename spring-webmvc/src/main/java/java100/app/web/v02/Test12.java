package java100.app.web.v02;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/v02/test12")
public class Test12 {
    
    @RequestMapping("m1")
    public String m1(String name, int age, boolean working, float height){
        System.out.println(name);
        System.out.println(age);
        System.out.println(working);
        System.out.println(height);
        System.out.println("----------------------------");
        return "/hello.jsp";
    }
    
    @RequestMapping("m2")
    public String m2(java.util.Date birthDate){
        System.out.println(birthDate);
        System.out.println("----------------------------");
        return "/hello.jsp";
    }

   /* @InitBinder
    protected void initBinder(WebDataBinder binder) {
        System.out.println("initBinder()");
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        dateFormat.setLenient(false);//날짜 형식을 엄격하게 검사하라, 관대하지 말아라
        binder.registerCustomEditor(Date.class, new CustomDateEditor(dateFormat, false));
    }
    */
    
    

}
