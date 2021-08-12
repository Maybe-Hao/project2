import com.hao.pojo.Auditor;
import com.hao.pojo.Message;
import com.hao.pojo.Users;
import com.hao.service.AuditorService;
import com.hao.service.MessageService;
import com.hao.service.UserService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Mytest {
    @Test
    public void test(){
        ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
//        BookService bookServiceImpl =(BookService) context.getBean("BookServiceImpl");
//        for(Books books:bookServiceImpl.queryAllBook()){
//            System.out.println(books);
//        }
        Message m=new Message();
        m.setAccount("123");
        m.setMessage("我要改变的凹！");
        m.setConstructDate("2021-8-21");
        MessageService messageService= (MessageService) context.getBean("messageServiceImpl");
        messageService.UpdateMessage(m);
        System.out.println("success");
    }
}
