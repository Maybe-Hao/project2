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
        UserService auditorService= (UserService) context.getBean("userServiceImpl");
        Users user=new Users();
        user.setAccount("233");
        user.setPassword("123");
        user.setName("233");
        user.setGender("1");
        user.setIdCard("123");
        user.setIdCardFrontFile("233");
        user.setIdCardBackFile("233");
        user.setMail("233");
        user.setPost("233");
        user.setUserPhoneNum("233");
        auditorService.addUser_User(user);
        System.out.println("success");
    }
}
