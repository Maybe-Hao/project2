package com.hao.controller;

import com.hao.pojo.Users;
import com.hao.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.commons.CommonsMultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.*;

@Controller
@RequestMapping("/user")
public class UserController {
    @Autowired
    @Qualifier("userServiceImpl")
    private UserService userService;

    //跳转到增加用户页面
    @RequestMapping("/ToAddUser")
    public String toAddPaper(){
        return "addUser";
    }

    @RequestMapping("/AddUser")
    public String AddUser(Users users){
        System.out.println("addBook="+users);
        userService.addUser(users);
        return "allUsers";
    }

    @RequestMapping("/ToUpDateUser")
    public String ToUpDateUser(Model model, String account){
        Users user=userService.queryUserByAct(account);
        System.out.println(user);
        model.addAttribute("QueryUser",user);
        return "updateUser";
    }
    @RequestMapping("/UpdateUser")
    public String UpdateUser(Model model, Users user) {
        System.out.println(user);//根据测试数据得知，此处已经获得了修改后的数据，但是由于测试数据不全，部分数据库要求的非空值被我们传入为是空值，所以sql语言运行不成功
        userService.updateUser(user);
        return "redirect:/book/allBook";
    }

    @RequestMapping("/toupload")
    public String toupload(){
        return "uploadfile";
    }
    @RequestMapping("/upload")
    @ResponseBody
    public String fileUpload(@RequestParam("file") CommonsMultipartFile file , HttpServletRequest request) throws IOException {

        //获取文件名 : file.getOriginalFilename();
        String uploadFileName = file.getOriginalFilename();

        //如果文件名为空，直接回到首页！
        if ("".equals(uploadFileName)){
            System.out.println("文件名为空，回到addUser页面");
            return "addUser";
        }
        System.out.println("上传文件名 : "+uploadFileName);

        //上传路径保存设置
        String path = request.getServletContext().getRealPath("/upload");
        //如果路径不存在，创建一个
        File realPath = new File(path);
        if (!realPath.exists()){
            realPath.mkdir();
        }
        System.out.println("上传文件保存地址："+realPath);

        InputStream is = file.getInputStream(); //文件输入流
        OutputStream os = new FileOutputStream(new File(realPath,uploadFileName)); //文件输出流

        //读取写出
        int len=0;
        byte[] buffer = new byte[1024];
        while ((len=is.read(buffer))!=-1){
            os.write(buffer,0,len);
            os.flush();
        }
        os.close();
        is.close();
        return "redirect:/allUsers";
    }
}
