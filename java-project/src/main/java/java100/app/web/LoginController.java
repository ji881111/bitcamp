package java100.app.web;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.bind.support.SessionStatus;
import org.springframework.web.client.RestTemplate;

import java100.app.dao.MemberDao;
import java100.app.domain.Member;
import java100.app.service.FacebookService;

@Controller
@RequestMapping("/auth")
@SessionAttributes("loginUser")
public class LoginController {
    
    @Autowired MemberDao memberDao;
    @Autowired FacebookService facebookService;
    
    @RequestMapping(value="login", method=RequestMethod.GET)
    public String form(Model model) {
        model.addAttribute("menuVisible", false);
        return "auth/loginform";
    }
    
    @RequestMapping(value="login", method=RequestMethod.POST)
    public String login(
            String email, 
            String password,
            String saveEmail,
            HttpServletResponse response,
            Model model) {
        HashMap<String,Object> params = new HashMap<>();
        params.put("email", email);
        params.put("password", password);
        
        Member member = memberDao.findByEmailAndPassword(params);
        
        if (saveEmail != null) {
            Cookie cookie = new Cookie("email", email);
            cookie.setMaxAge(60 * 60 * 24 * 30);
            response.addCookie(cookie);
        } else {
            Cookie cookie = new Cookie("email", "");
            cookie.setMaxAge(0);
            response.addCookie(cookie);
        }
        
        if (member == null) {
            model.addAttribute("loginUser", null);
            model.addAttribute("menuVisible", false);
            return "auth/loginfail"; 
        }
        
        model.addAttribute("loginUser", member);
        
        return "redirect:../score/list";
    }
    
    @RequestMapping(value="facebookLogin")
    public String facebookLogin(
            String accessToken, 
            HttpServletResponse response,
            HttpSession session,
            Model model) {
        
        RestTemplate restTemplate = new RestTemplate();
        
        try{
        Map result = restTemplate.getForObject(
                "https://graph.facebook.com/v2.12/me?access_token={v1}&fields={v2}", 
                Map.class,
                accessToken,"id,name,email");
        
        Member member = memberService.get((String)result.get("email"));
        
        if(member == null){
            member = new Member();
            member.setName((String)result.get("name"));
            member.setEmail((String)result.get("email"));
            member.setPassword("1111");
            memberService.add(member);  
        }
        model.addAttribute("loginUser",member);
        return "redirect:../score/list";
        
        }catch (Exception e){
            
            return "auth/loginfail";
            
        }
    }
    
    @RequestMapping("logout")
    public String logout(HttpSession session, SessionStatus status) {
        
        // @SessionAttributes에서 관리하는 세션 데이터를 모두 제거한다.
        status.setComplete();
        
        // HttpSession 객체를 무효화시킨다.
        session.invalidate();
        
        return "redirect:login";
    }
}










