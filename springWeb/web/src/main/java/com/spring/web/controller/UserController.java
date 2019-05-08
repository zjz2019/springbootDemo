package com.spring.web.controller;

import com.spring.web.model.User;
import com.spring.web.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.*;

@RestController//控制类注解
@EnableAutoConfiguration//自动装配
//@RequestMapping("/testboot")
public class UserController {
    @Value("${name}")//获取配置文件
    private  String name;
    @Value("${txt}")
    private  String wcTime;
    @Autowired//bean注入
    private UserService userService;
    @Autowired
    private User user;

    @GetMapping(value = "/hi")
    public  String hello(){
        return "hello world";
    }
    @RequestMapping(value = "hello",method = RequestMethod.GET)//路由注解
    public String say(){
        return "hello world"+name+",时间:"+wcTime+",实体类:"+user.toString();
    }
    @RequestMapping(value = "/do/{id}",method = RequestMethod.GET)
    public String doSomeThing(@PathVariable Integer id){//获取后缀注解
        return "获取url后缀:"+id.toString();
    }
    @RequestMapping(value = "/see",method = RequestMethod.GET)
    public String see(@RequestParam(value = "ids",required = false,defaultValue = "0") Integer ids){//required 是否必传   defaultValue 默认值
        return "获取url参数:"+ids.toString();
    }
    @RequestMapping(value = "/info",method = RequestMethod.GET)
    public String getinfo(){//获取后缀注解
        return "进入getinfo:"+wcTime;
    }
}
