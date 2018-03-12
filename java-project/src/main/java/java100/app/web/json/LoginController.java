package java100.app.web.json;

import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java100.app.domain.Score;
import java100.app.service.FacebookService;
import java100.app.service.MemberService;

@RestController
@RequestMapping("/login")
public class LoginController {
    
    @Autowired MemberService memberService;
    @Autowired FacebookService facebookService;
 
    @Re
    
}

