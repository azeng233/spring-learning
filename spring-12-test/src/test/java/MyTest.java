import cn.zengchen233.dao.UserMapper;
import cn.zengchen233.pojo.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class MyTest {
    @Test
    public void test() {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserMapper mapper = context.getBean("userMapper", UserMapper.class);
        List<User> users = mapper.getAllUser();
        for (User user : users) {
            System.out.println(user);
        }
    }
}
