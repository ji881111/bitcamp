package step8;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.oreilly.servlet.MultipartRequest;
import com.oreilly.servlet.multipart.DefaultFileRenamePolicy;

@SuppressWarnings("serial")
@WebServlet("/step8/Servlet09")
public class Servlet09 extends HttpServlet {

    @Override
    protected void doPost (HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        
        MultipartRequest multi=new MultipartRequest(req,"C:\\Users\\bit-user\\workspace\\java-web\\gradle",1024*2000000,"UTF-8", new DefaultFileRenamePolicy());
        
        String name = multi.getParameter("name");
        String age=multi.getParameter("age");
        String photo1FIlename= multi.getFilesystemName("photo1");
        String photo2FIlename= multi.getFilesystemName("photo2");

        req.setCharacterEncoding("UTF-8");
        res.setContentType("text/plain;charset=UTF-8");
        PrintWriter out = res.getWriter();
        
        out.printf("이름 = %s\n", name);
        out.printf("나이 = %s\n", age);
        out.printf("사진1 = %s\n", photo1FIlename);
        out.printf("사진2 = %s\n", photo2FIlename);
        
    } 
}
