package step3;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

@WebListener //따로 url지정 노노
public class Listener01 implements ServletContextListener {
    @Override
    public void contextInitialized(ServletContextEvent sce) {
        System.out.println("Listener01.contextInitialized()");
    }
    
    @Override
    public void contextDestroyed(ServletContextEvent sce) {
        System.out.println("Listener01.contextDestroyed()");
    }
    
    

}
