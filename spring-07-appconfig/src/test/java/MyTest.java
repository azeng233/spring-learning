import cn.zengchen233.config.config;
import cn.zengchen233.pojo.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MyTest {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(config.class);
        User getUser = (User) context.getBean("getUser");
        System.out.println(getUser.getName());
    }
}
