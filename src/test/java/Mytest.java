import com.hao.pojo.Auditor;
import com.hao.pojo.Message;
import com.hao.pojo.Users;
import com.hao.service.AuditorService;
import com.hao.service.MessageService;
import com.hao.service.UserService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class Mytest {
    @Test
    public void test(){
        ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
//        BookService bookServiceImpl =(BookService) context.getBean("BookServiceImpl");
//        for(Books books:bookServiceImpl.queryAllBook()){
//            System.out.println(books);
//        }
        MessageService auditorService= (MessageService) context.getBean("messageServiceImpl");
        System.out.println(auditorService.queryMessageByAct("11"));
        System.out.println("success");
    }
}
