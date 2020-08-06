package com.nenu.Controller;

import com.nenu.Service.IUserService;
import com.nenu.domain.User;
import com.nenu.utils.RandomValidateCode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.List;

@Controller
public class UserController {
    @Autowired
    private IUserService userService;

    /**
     * 获取生成验证码显示到 UI 界面
     * @param request
     * @param response
     * @throws ServletException
     * @throws IOException
     */
    @RequestMapping(value="/checkCode")
    public void checkCode(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        //设置相应类型,告诉浏览器输出的内容为图片
        response.setContentType("image/jpeg");

        //设置响应头信息，告诉浏览器不要缓存此内容
        response.setHeader("pragma", "no-cache");
        response.setHeader("Cache-Control", "no-cache");
        response.setDateHeader("Expire", 0);

        RandomValidateCode randomValidateCode = new RandomValidateCode();
        try {
            randomValidateCode.getRandcode(request, response);//输出图片方法
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @RequestMapping(value = "/u_login")
    public ModelAndView u_login(String username, String password, ModelAndView mv, HttpSession session){
        User user = userService.u_login(username,password);
        if (user!=null){
            //登录成功保存在session
            session.setAttribute("user",user);
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
    @RequestMapping(value = "/u_register")
    public String register(User user){
        //无该用户可以注册
        if (user!=null){
            userService.u_register(user);
//            跳转
            return "success";
        }
        else{
            return "error";
        }
    }
//    @RequestMapping("/test")
//    public String test(String code,HttpSession session){
//        String randomCode = (String) session.getAttribute(RANDOMCODEKEY);
//        if (code.equals(randomCode)){
//            return "success";
//        }
//        else {
//            return "error";
//        }
//    }
}
