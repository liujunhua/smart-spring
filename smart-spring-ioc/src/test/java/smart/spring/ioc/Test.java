package smart.spring.ioc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import smart.srping.ioc.User;

/**
 * @author liujunhua
 * @description: 测试
 * @date 2020/8/1311:08
 */
public class Test {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("services.xml");
        User user = context.getBean("user", User.class);
        System.out.println(user.toString());
    }
}
