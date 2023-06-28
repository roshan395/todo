package com.roshan.springboot.myfirstwebapp.login;


import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

@Controller
@SessionAttributes("name")
public class LoginController {
	
	private AuthenticationService authService;
	
	public LoginController(AuthenticationService authService) {
		super();
		this.authService = authService;
	}

	@RequestMapping(value="login",method=RequestMethod.GET)
	public String login() {
		return "login";
	}
	
	@RequestMapping(value="login",method=RequestMethod.POST)
	public String welcome(@RequestParam String name, @RequestParam String password, ModelMap model) {
		model.put("name", name);
		if(authService.authenticate(name, password)) {
			return "welcome";
		}
		model.put("errorMessage", "invalid credentials, Try again.");
		return "login";
	}

}
