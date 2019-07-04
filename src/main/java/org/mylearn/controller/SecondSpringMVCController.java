package org.mylearn.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("controller")
public class SecondSpringMVCController {
    @RequestMapping("welcome2") //映射地址组合后为controller/welcome2
    public String welcome2() {
        return "success"; // 跳转到/WEB-INF/views/success.jsp
    }

    //映射地址组合后为controller/welcome3，且只拦截POST请求
    @RequestMapping(value = "welcome3",method = RequestMethod.POST)
    public String welcome3() {
        return "success"; // 跳转到/WEB-INF/views/success.jsp
    }

    //映射地址组合后为controller/welcome4，且只拦截POST请求，
    //且请求参数中必须有name参数，且name的的值必须是zs，且age必须不等于18
    @RequestMapping(value = "welcome4",method = RequestMethod.POST,params = {"name=zs","age!=18"})
    public String welcome4() {
        return "success"; // 跳转到/WEB-INF/views/success.jsp
    }

    //通过@PathVariable获取动态参数
    @RequestMapping(value = "welcome5/{name}")
    public String welcome5(@PathVariable("name") String name) {
        //过去获取参数的方法：String name = request.getParameter("name");
        System.out.println(name);
        return "success"; // 跳转到/WEB-INF/views/success.jsp
    }


}

