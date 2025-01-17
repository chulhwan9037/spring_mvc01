package com.ict.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

// 컨트롤러를 어노테이션 하지 않으면 반드시 Controller 구현해야 한다. => 반환형이 ModelAndView 이다.  
public class Start1Controller implements Controller{
	
	// 실제 실행하는 메서드
	// 어노테이션을 하지 않으면 반환형은 ModelAndView 이다.
	// 어노테이션을 하면 반환형으로 String 또는 ModelAndView(기본) 이다.  
	@Override
	public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
		// 일처리 저장하는 곳이 Model 이고  
		// 되돌아 갈 jsp 지정하는게 view
		
		// 방법 1
		// ModelAndView mv = new ModelAndView();
		// mv.setViewName("뷰네임 = 되돌아갈 jsp 이름"); 확장자이름을 붙이지 않는다. 
		// 방법 2
		// ModelAndView mv = new ModelAndView("뷰네임 = 되돌아갈 jsp 이름");

		ModelAndView mv = new ModelAndView();
		// 확장자 이름을 붙이지 않는다. 
		// 경로도 붙이지 안는다. 
		mv.setViewName("result1");
		
		// 일처리 = 비지니스 로직 => 서비스 => 서비스임플 => 맵퍼(DAO) => DB처리 
		
		// jsp 처럼 필요한 정보를 ModelAndView 를 이용해서 저장하자. 
		// 1. ModelAndView
		mv.addObject("name", "홍길동");
		mv.addObject("age", 17);
		// 모델엔뷰도 request에 저장
		
		// 2. request
		request.setAttribute("addr", "서울");
		
		// 3. session
		request.getSession().setAttribute("phone", "010-7777-9999");
		
		return mv;
	}
}

















