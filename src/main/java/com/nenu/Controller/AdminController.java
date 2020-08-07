package com.nenu.Controller;


import com.nenu.Service.IAdminService;
import com.nenu.domain.Admin;
import com.nenu.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpSession;

@Controller
public class AdminController {

    @Autowired
    private IAdminService adminService;

    @RequestMapping(value = "/a_login")
    public ModelAndView u_login(String a_name, String a_password, ModelAndView mv, HttpSession session){
        Admin admin = adminService.a_login(a_name,a_password);
        if (admin!=null){
            //登录成功保存在session
            session.setAttribute("admin",admin);
            //跳转页面
            mv.setViewName("success");
        }
        else {
            //登录失败
            mv.addObject("error","用户名密码错误，重新登录");
            //跳转
            mv.setViewName("error");
        }
        return mv;
    }

    //注册
    @RequestMapping(value = "/a_register")
    public String register(Admin admin){
        //无该用户可以注册
        if (admin!=null){
            adminService.a_register(admin);
//            跳转
            return "success";
        }
        else{
            return "error";
        }
    }
}
