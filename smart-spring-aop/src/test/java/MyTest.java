import com.smart.spring.aop.service.UserService;
import com.smart.spring.aop.service.UserServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author liujunhua
 * @description: MyTest
 * @date 2020/9/714:46
 */
public class MyTest {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("services.xml");
        UserService userService = applicationContext.getBean("userService", UserService.class);
        userService.add();
    }
}
