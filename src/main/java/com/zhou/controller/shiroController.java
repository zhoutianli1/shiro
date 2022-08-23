package com.zhou.controller;


import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.IncorrectCredentialsException;
import org.apache.shiro.authc.UnknownAccountException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class shiroController {


    @RequestMapping({"/","index"})
    public String toIndex(Model model)
    {
        model.addAttribute("msg","hello,world");
        return "index";
    }
    @RequestMapping("toLogin") //去登录页面login.html
    public String toLogin()
    {
        return "login";
    }
    @RequestMapping("login")   //在login.html 点击登录后的处理
    public String Login(String username,String password,Model model)
    {
        //获取当前用户
        Subject subject = SecurityUtils.getSubject();
        //封装当前用户
        UsernamePasswordToken token = new UsernamePasswordToken(username,password);
        //执行登录在subiect这个类，但是真实的用户操作在Myrealm的认证中
        try {
            subject.login(token); //执行登录的方法，没有异常说明登录成功.返回主页index
            return "index";
        } catch (UnknownAccountException e) { //用户不存在
            model.addAttribute("msg","用户名出错");
            return "login";
        }catch (IncorrectCredentialsException e){ //密码不存在
            model.addAttribute("msg","密码出错");
            return "login";
        }
    }

    @RequestMapping("/user/add")
    public String add()
    {
        return "user/add";
    }
    @RequestMapping("/user/update")
    public String update()
    {
        return "user/update";
    }


    @GetMapping("/{url}")
    public String redirect(@PathVariable("url") String url){
        return url;
    }



    @RequestMapping("/unauth")
    @ResponseBody
    public String unauth(){
        return "未授权没有访问权限";
    }
}
