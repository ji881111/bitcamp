package java100.app.listener;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java100.app.AppConfig;
import java100.app.util.DataSource;

//@WebListener
public class ContextLoaderListener implements ServletContextListener {
    
    public static AnnotationConfigApplicationContext iocContainer;
    
    @Override
    public void contextInitialized(ServletContextEvent sce) {
        ServletContext webApplivationInfo = sce.getServletContext();
        String configClassName = webApplivationInfo.getInitParameter("contextConfigLocation");

        try {
            
            Class<?> configClass = Class.forName(configClassName);
            iocContainer = new AnnotationConfigApplicationContext(AppConfig.class);
            
        }catch(Exception e) {
            e.printStackTrace();
        }
    }
    
    @Override
    public void contextDestroyed(ServletContextEvent sce) {
        DataSource ds = iocContainer.getBean(DataSource.class);
        ds.close();
    }
}
