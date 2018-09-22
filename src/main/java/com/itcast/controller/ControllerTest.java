package com.itcast.controller;

import com.itcast.domain.Account;
import com.itcast.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;


@Controller
@RequestMapping("/springmvc")
public class ControllerTest {

    @Autowired
    private AccountService accountService;

    @RequestMapping("/mvc")
    public String textFind(Model model){
        List<Account> list = accountService.findAll();
        System.out.println("控制器执行....");
        for (Account account : list) {
            System.out.println(account);
        }
        model.addAttribute("list",list);
        return "success";
    }

    @RequestMapping("/save")
    public void textSave(Account account, HttpServletRequest request, HttpServletResponse response) throws IOException {
       accountService.save(account);
       response.sendRedirect(request.getContextPath()+"/springmvc/mvc");
    }
}
