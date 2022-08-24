package com.example.demo;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HomeController {
	@RequestMapping("home")
	public String home(@RequestParam("name")String myname,HttpSession session)
   {
       // HttpSession session=req.getSession();
		//String name=req.getParameter("name");
		System.out.println("hi " + myname);
		session.setAttribute("name", myname);
		return "Home";
	}

}
