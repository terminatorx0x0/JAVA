package com.terminator.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexController {
	private static final org.apache.log4j.Logger Logger=org.apache.log4j.Logger.getLogger(IndexController.class);
	//instance initializer block
	/*
	{
	*	BasicConfigurator.configure();
	}
	*/
	@GetMapping("/")
	public String Index() {
		
		Logger.debug("loading index page...");
		Logger.info("INFO level message");
		Logger.warn("WARN level message");
		Logger.error("ERROR level message");
		Logger.fatal("FATAL level message");
	    
		Logger.debug("Exit of index page");
		return "Index";
	}

}
