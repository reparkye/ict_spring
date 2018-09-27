package com.ict.sp.controllar;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.ict.sp.service.TestService;

@Controller
public class TestController {

	@Autowired
	private TestService ts;
	
	@RequestMapping(value="/test",method=RequestMethod.GET)//url패턴,안쓰게되면 전부 동작?
	public String test(Model m) {				//매핑을 test로 해놓았기때문에 localhost/test 해놨을때 test.jsp 출력
		m.addAttribute("list",ts.getList());
		return "test";//뷰를 이친구에게
	}
}
