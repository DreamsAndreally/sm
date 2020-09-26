import cn.com.controller.Mycontroll;
import cn.com.domain.Dog;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class springTest {
    @Test
    public void test01() {
        //加载spring的资源配置文件
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        Dog dog = (Dog) applicationContext.getBean(Dog.class);
        Dog dog1 = (Dog) applicationContext.getBean(Dog.class);
        System.out.println(dog);
        System.out.println(dog1);

    }

    @Test
    public void test02() {
        //加载spring的资源配置文件
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        Mycontroll bean = applicationContext.getBean(Mycontroll.class);
        bean.aa();


    }
}
