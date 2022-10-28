//package com.newlecture.web.controller.notice;			함수가 컨트롤러 역할하는걸로 바껴서 이 클래스자체가 필요없어짐
//
//import java.util.List;
//
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.servlet.ModelAndView;
//import org.springframework.web.servlet.mvc.Controller;
//
//import com.newlecture.web.entity.Notice;
//import com.newlecture.web.service.NoticeService;
//import com.newlecture.web.service.jdbc.JDBCNoticeService;
//
//public class ListController implements Controller{
//	@Autowired
//	private NoticeService noticeService;
//	
//	@Override
//	public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
//		
//		ModelAndView mv = new ModelAndView("notice.list");
//		//mv.setViewName("WEB-INF/view/notice/list.jsp");
//		List<Notice> list = noticeService.getList(1, "TITLE", "");
//		mv.addObject("list",list);		//모델로 얘가 전달됨
//		
//		return mv;
//	}
//
//}
