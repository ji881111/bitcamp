 package step11;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@SuppressWarnings("serial")
@WebServlet("/step11/Servlet05")
public class Servlet05 extends HttpServlet {

    @Override
    public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        
        res.addCookie(new Cookie("name", "hong"));
        
        //모든경로
        Cookie cookie = new Cookie("age","20");
        cookie.setPath("/");
        res.addCookie(cookie);

        //특정경로
        cookie = new Cookie("working","true");
        cookie.setPath("/java-web/other/");
        res.addCookie(cookie);

        res.setContentType("text/plain;charset=UTF-8");
        PrintWriter out = res.getWriter();
        out.println("쿠키를 보냈음");
        
    
    }

}
