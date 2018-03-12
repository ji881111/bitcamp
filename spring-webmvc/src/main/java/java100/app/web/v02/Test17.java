package java100.app.web.v02;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.google.gson.Gson;

@Controller
@RequestMapping("/v02/test17")
public class Test17 {

    @RequestMapping("/m1")
    public String m1(@RequestBody String json) {

        @SuppressWarnings("rawtypes")
        Map obj = new Gson().fromJson(json, Map.class);

        System.out.printf("name=%s\n", obj.get("name"));
        System.out.printf("age=%s\n", obj.get("age"));
        System.out.printf("tel=%s\n", obj.get("tel"));
        System.out.printf("email=%s\n", obj.get("email"));

        System.out.println("---------------------------------------------");

        return "/hello.jsp";
    }
    
    class User{
        String name;
        int age;
        String tel;
        String email;
    }
    
    @RequestMapping("/m2")
    public String m2(@RequestBody String json) {

        @SuppressWarnings("rawtypes")
        User user = new Gson().fromJson(json, User.class);

        System.out.printf("name=%s\n", user.name);
        System.out.printf("age=%d\n", user.age);
        System.out.printf("tel=%s\n", user.tel);
        System.out.printf("email=%s\n", user.email);

        System.out.println("---------------------------------------------");

        return "/hello.jsp";
    }
    
    static class User2{
        String name;
        int age;
        String tel;
        String email;
        
        public User2(){}
        
        public String getName() {
            return name;
        }
        public void setName(String name) {
            this.name = name;
        }
        public int getAge() {
            return age;
        }
        public void setAge(int age) {
            this.age = age;
        }
        public String getTel() {
            return tel;
        }
        public void setTel(String tel) {
            this.tel = tel;
        }
        public String getEmail() {
            return email;
        }
        public void setEmail(String email) {
            this.email = email;
        }
        
    }
    
    @RequestMapping(value="/m3")
    public String m3(@RequestBody User2 user2) {

        System.out.printf("name=%s\n", user2.name);
        System.out.printf("age=%d\n", user2.age);
        System.out.printf("tel=%s\n", user2.tel);
        System.out.printf("email=%s\n", user2.email);

        System.out.println("---------------------------------------------");

        return "/hello.jsp";
    }
}
