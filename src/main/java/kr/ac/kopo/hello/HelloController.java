package kr.ac.kopo.hello;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloController {
	// localhost:8080/springmvc/hello/hello.do 요청이 들어오면
	// hello() 메소드가 매핑
	@RequestMapping("/hello/hello.do") //  /hello/hello.do 요청이 들어오면 메소드 실행
	public ModelAndView hello() {
		/*
		 * ModelAndView 모델과 뷰를 둘 다 가짐 
		 */
		// jsp 주소를 찾아줌 _ hello/hello -> hello/hello.jsp 실행 (뷰)
		ModelAndView mav = new ModelAndView("hello/hello"); // hello/hello 뷰네임
		// msg라는 이름으로 모델 추가 -> jsp가 msg를 사용 할 수 있다.
		mav.addObject("msg", "Hello Spring MVC!!");
		
		// 뷰와 모델이 같이 전달
		return mav;
	}
}

/*
 * 리턴타입
 * 1. ModelAndView
 * 2. String (jsp 주소)
 * 3. void
 * 4. json string (jsp 주소가 아닌 것) 
 */
