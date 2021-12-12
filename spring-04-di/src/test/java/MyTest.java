import cn.zengchen233.pojo.Student;
import cn.zengchen233.pojo.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        Student student = (Student) context.getBean("student");
        System.out.println(student.toString());
    }

    @Test
    public void test2() {
        ApplicationContext context = new ClassPathXmlApplicationContext("userbeans.xml.");
        User user = (User) context.getBean("user2");
        System.out.println(user);

    }



}





/*
Student{name='曾晨',
address=Address{address='湖北'},
books=[三国演义, 西游记, 水浒传, 红楼梦],
hobbies=[听歌, 敲代码],
card={身份证=12345678, 姓名=曾晨},
games=[LOL, COC, BOB],
info={性别=男, 姓名=曾晨, 身份证=12345678},
wife='null'}
 */