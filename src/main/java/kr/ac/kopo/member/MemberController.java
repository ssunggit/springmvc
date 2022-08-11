package kr.ac.kopo.member;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MemberController {
//	http://localhost:8080/springmvc/form/joinForm.do
	@RequestMapping("/form/joinForm.do") 
	public String get(){
		
		// WEB-INF/jsp/form/joinForm.jsp 열어줘
		return "form/joinForm";
	}
	
	//@RequestMapping("join.do")
	public String join(HttpServletRequest request){ // request는 jsp와 자바가 값을 공유하기 때문에 request를 통해 받고 싶어서
//		VO 에 담아서 전달
		MemberVO member = new MemberVO(); // 스프링에서 관리하지 않는다.	
		
		String id = request.getParameter("id");
		String password = request.getParameter("password");
		String name = request.getParameter("name");
		
		member.setId(id);
		member.setPassword(password);
		member.setName(name);
		
		request.setAttribute("member", member);
		
//		파라미터로 받은 변수들 저장 
//		request.setAttribute("id", id);
//		request.setAttribute("password", password);
//		request.setAttribute("name", name);
		
		// form/memberInfo 보여줘.
		return "form/memberInfo";
	}
	
//	@RequestMapping("join.do")						// @RequestParam 으로 넘어오는 값을 매개변수에 저장함
	public String join2(HttpServletRequest request, @RequestParam("id") String id, @RequestParam("password") String password, @RequestParam("name") String name ){ 		
		System.out.println("id: " + id);
		System.out.println("password: " + password);
		System.out.println("name: " + name);
		
		MemberVO member = new MemberVO(); 	
		
		member.setId(id);
		member.setPassword(password);
		member.setName(name);
		
		request.setAttribute("member", member);
		
		// form/memberInfo 보여줘.
		return "form/memberInfo";
	}
	
//	@RequestMapping("join.do")						
	public String join3(MemberVO member){ // 스프링이 알아서 jsp에 넘어온 값들을 vo에 필드 이름이 같은 아이들에 맞춰 담아옴	
		
		System.out.println("id: " + member.getId());
		System.out.println("password: " + member.getPassword());
		System.out.println("name: " + member.getName());
		// ★ MemberVO에 객체를 memberVO 이름으로 등록시킴 
		
		// form/memberInfo 보여줘.
		return "form/memberInfo";
	}
	
//	@RequestMapping("join.do")						
	public String join4(@ModelAttribute("member") MemberVO member){ // -> @ModelAttribute("member") : member라는 이름으로 모델의 이름을 바꿈 
		
		System.out.println("id: " + member.getId());
		System.out.println("password: " + member.getPassword());
		System.out.println("name: " + member.getName());
		
		// form/memberInfo 보여줘.
		return "form/memberInfo";
	}
	
//	@RequestMapping("join.do")						
	public ModelAndView join5(MemberVO member){ 
	
		ModelAndView mav = new ModelAndView();
						// = new ModelAndView("form/memberInfo");
		
		// view name setting
		// WEB-INF/jsp/form/memberInfo.jsp
		mav.setViewName("form/memberInfo");
		mav.addObject("member1", member);
		
		/* jsp에서 memberVO, member1 두개의 이름으로 사용가능하다 */
		
		// form/memberInfo 보여줘.
		return mav;

	}
	
	@RequestMapping("join.do")						
	public String join6(MemberVO member){ 
		
		// http://localhost:8080/springmvc + "/"
		return "redirect:/"; // 뷰 리절브가 뷰로 인식하지 않아 뷰를 주지 않고 새로운 request를 요청하게함
	}
}
