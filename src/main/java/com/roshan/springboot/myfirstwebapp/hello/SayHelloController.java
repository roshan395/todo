package com.roshan.springboot.myfirstwebapp.hello;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
public class SayHelloController {
	
	@RequestMapping("/say")
	@ResponseBody
	public String say() {
		return "Hello! what are you learning today?";
	}
	
	@RequestMapping("say-jsp")
	public String sayjsp() {
		return "sayHello";
	}

}
