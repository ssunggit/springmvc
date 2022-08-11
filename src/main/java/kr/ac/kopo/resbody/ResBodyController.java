package kr.ac.kopo.resbody;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import kr.ac.kopo.member.MemberVO;

//@RestController // 컨트롤러 api 면서 restAPI -> 모든 메소드들이 @ResponseBody 로 수행 -> 에이젝스로 구현될 부분
@Controller
public class ResBodyController {
	
	
	
	@ResponseBody
	@RequestMapping("/resBody.do")
	public String resStringBody() {
		return "OK. 성공!";
	}
	
	@ResponseBody
	@RequestMapping("/resJsonBody.json")
	public Map<String, String> resJsonBody(){
		Map<String, String> map = new HashMap<>();
		map.put("id", "park");
		map.put("name", "sung");
		map.put("password", "1234");
		return map;
	}
	
	@ResponseBody
	@RequestMapping("/resVOBody.json")
	public MemberVO resJsonVO(){
		MemberVO member = new MemberVO();
		member.setId("id");
		member.setPassword("password");
		member.setName("name");
		
		return member;
	}
	
	@ResponseBody
	@RequestMapping("/resJsonListBody.json")
	public List<MemberVO> resJsonListBody(){
		List<MemberVO> memberlist = new ArrayList<>();
		for(int i=0; i<5; i++) {
			MemberVO member = new MemberVO();
			member.setId("id");
			member.setPassword("password");
			member.setName("name");
			
			memberlist.add(member);
		}
		return memberlist;
	}
}
