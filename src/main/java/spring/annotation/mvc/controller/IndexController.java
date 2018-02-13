package spring.annotation.mvc.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class IndexController {

	@RequestMapping("/hello")
	public String hello(HttpServletRequest request, HttpServletResponse response) {
		System.out.println("Here");
		/*ModelAndView mv=new ModelAndView();
		mv.setViewName("hello-world");*/
		return "hello-world.jsp";
	}
}
