package com.in28minutes.springboot.myfirswebapp.hello;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class SayHelloController 
{
	//"Say-hello=>"Hellow what are you learning today
//	@RequestMapping("say-hello")
//	@ResponseBody
//	public String sayHello()
//	{
//		return "Hello! what are you learning today?";
//	}
//	
//	@RequestMapping("say-hello-html")
//	@ResponseBody
//	public String sayHellohtml()
//	{
//		StringBuffer sb=new StringBuffer();
//		sb.append("<html>");
//		sb.append("<head>");
//		sb.append("<title> My first HTML PAGE</title>");
//		sb.append("</head>");
//		sb.append("<body>");
//		sb.append("My first html page with body");
//		sb.append("</body>");
//		sb.append("</html>");
//		return sb.toString();
//	}
	
	@RequestMapping("say-hello-jsp")
	public String sayHelloJsp()
	{
		System.out.println("hello");
		return "sayHello";
	}

}
