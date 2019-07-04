package org.mylearn.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class FirstSpringMVCController {
    @RequestMapping("welcome") //映射地址，下面的方法名可以与@RequestMapping的映射地址名不同名
    public String welcome() {
        // 跳转到/WEB-INF/views/success.jsp，页面跳转默认使用“请求转发”的方式
        return "success";
    }
}
