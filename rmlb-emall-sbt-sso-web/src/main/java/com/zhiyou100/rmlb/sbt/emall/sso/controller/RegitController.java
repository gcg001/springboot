package com.zhiyou100.rmlb.sbt.emall.sso.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class RegitController {
	
	
		@RequestMapping("/page/register")
		public String regit() {
			return "register"; 
		}
		
		
}
