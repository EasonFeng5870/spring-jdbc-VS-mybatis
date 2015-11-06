package servlet;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/v1")
public class TestController {
	
	@RequestMapping("/test")
	public String testController(){
		System.out.println("this is a spring mvc project");
		return "good";
	}

}
