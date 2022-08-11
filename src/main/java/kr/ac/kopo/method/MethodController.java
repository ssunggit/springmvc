package kr.ac.kopo.method;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

// @RequestMapping("/method/method.do")
@Controller
public class MethodController {
	
//	@RequestMapping(value = "/method/method.do", method=RequestMethod.GET) // GET 요청을 받음
	@GetMapping("/method/method.do")
	public String get(){
		return "method/methodForm";
	}
	
//	@RequestMapping(value = "/method/method.do", method=RequestMethod.POST) // post 요청을 받음
	@PostMapping("/method/method.do")
	public String post(){
		return "method/methodProcess";
	}
	
	
}

