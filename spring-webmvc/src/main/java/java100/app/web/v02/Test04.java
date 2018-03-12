package java100.app.web.v02;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/v02/test04")
public class Test04 {
    
    @RequestMapping(method=RequestMethod.GET)
    public String m1(){
        System.out.println("get()");
        return "/hello.jsp";
    }
    
    @RequestMapping(method=RequestMethod.POST)
    public String m2(){
        System.out.println("post()");
        return "/hello.jsp";
    }
    
    @RequestMapping(value="m1", method=RequestMethod.GET)
    public String m3(){
        System.out.println("m1Get()");
        return "/hello.jsp";
    }
    
    @RequestMapping(path="m1",method=RequestMethod.POST)
    public String m4(){
        System.out.println("m1Post()");
        return "/hello.jsp";
    }
    

}
