package com.hao.controller;

import com.hao.pojo.Books;
import com.hao.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/book")
public class BookController {
    //controller 调用 service
    @Autowired
    @Qualifier("BookServiceImpl")
    private BookService bookService;

    //查询全部书籍信息，并返回到一个展示页面
    @RequestMapping("/allBook")
    public String list(Model model){
        List<Books> list =bookService.queryAllBook();
        model.addAttribute("list",list);
        return "allBook";
    }

    //跳转到增加书籍页面
    @RequestMapping("/ToAddBook")
    public String toAddPaper(){
        return "addBook";
    }

    @RequestMapping("addBook")
        public String addBook(Books books){
            System.out.println("addBook="+books);
            bookService.addBook(books);
            return "redirect:/book/allBook";
        }


    @RequestMapping("/ToUpDateBook")
    public String toUpdateBook(Model model,int id){
        Books book=bookService.queryBookById(id);
        model.addAttribute("QueryBook",book);
        return "updateBook";
    }
    @RequestMapping("/updateBook")
    public String updateBook(Model model, Books book) {
        System.out.println(book);
        bookService.updateBook(book);
        return "redirect:/book/allBook";
    }

    @RequestMapping("/deleteBook")
    public String deleteBook(int id){
        bookService.deleteBookById(id);
        return "redirect:/book/allBook";
    }
    @RequestMapping("/queryBook")
    public String queryBook(String QueryBookName,Model model){
        Books books=bookService.queryBookByName(QueryBookName);
        List<Books> list=new ArrayList<Books>();
        list.add(books);
        if(books==null){
            list=bookService.queryAllBook();
            model.addAttribute("error","未查到该书籍信息");
        }
        model.addAttribute("list",list);
        return "allBook";
    }
}
