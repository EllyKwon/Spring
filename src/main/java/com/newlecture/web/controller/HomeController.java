package com.newlecture.web.controller;		// 프론트컨트롤러(디스패처클래스)가 이 클래스를 컨테이너에서 꺼내서 얘가 가지고있는기능 호출함

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/")
public class HomeController {

	@RequestMapping("index")
	@ResponseBody
	public String index() {
	
		return "root.index";
	}
	

	
//	@Override
//	public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
//
//		ModelAndView mv = new ModelAndView("root.index");		// 뷰가있는 정보를 전달
//		mv.addObject("data","Hello Spring MVC~");
//		//mv.setViewName("WEB-INF/view/index.jsp");
//		return mv;
//	}

}
