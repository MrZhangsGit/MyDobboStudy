import com.api.service.DemoApi;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

public class ConsumerTest {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("classpath:springmvc.xml");
        context.start();

        DemoApi demoApi = (DemoApi) context.getBean("demoApi");
        System.out.println(demoApi.sayHello());
        try {
            /**
             * 按任意键退出
             */
            System.in.read();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
