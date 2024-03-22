package com.ict.edu.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import com.ict.edu.service.Test01Service;

@Controller
public class Test01Controller {
	
	// 변수이름과 참조하는 클래스의 아이디가 같을 때 : @Autowired 만 사용
	@Autowired
	private Test01Service test01service;
	
	@GetMapping("hello.do")
	public ModelAndView HelloCommand() {
		ModelAndView mv = new ModelAndView("test01/result");

		String msg = test01service.getGreeting();
		mv.addObject("msg", msg);
		return mv;
	}
	
}
