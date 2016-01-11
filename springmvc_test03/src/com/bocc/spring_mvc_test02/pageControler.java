package com.bocc.spring_mvc_test02;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;  
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
public class pageControler {

	@RequestMapping("/helloWorld.html")  
    public String helloworld(HttpServletRequest request) {  
        // return "success"; //跳转到success页面  
        return "index";  
    }  
	@RequestMapping("/xuyuyuan.html")  
    public String xuyuyuan(HttpServletRequest request) {  
        // return "success"; //跳转到success页面  
        return "/jsp/error";  
    } 
}
