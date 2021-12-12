import cn.zengchen233.dao.UserMapper;
import cn.zengchen233.pojo.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");
        UserMapper userMapper = context.getBean("userMapper", UserMapper.class);
        userMapper.selectUser();
    }

    @Test
    public void MyTest() {
        User user = new User(6, "曾晨", "123123");
        ApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");
        UserMapper userMapper = context.getBean("userMapper", UserMapper.class);
        userMapper.addUser(user);
        userMapper.delUser(6);
    }
}
