import jakarta.servlet.ServletContextEvent;
import jakarta.servlet.ServletContextListener;
import jakarta.servlet.annotation.WebListener;

@WebListener
public class MyListener implements ServletContextListener {
    @Override
    public void contextInitialized(ServletContextEvent sce) {
        System.out.println("项目启动成功");
    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {
        System.out.println("项目关闭");
    }
}