package in.mytes.mytesauthentication.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user/auth")
public class AuthenticationController {
	
	@GetMapping("/email/{email}")
	public void authenticateViaEmail(@PathVariable String email) {
		//TODO
	}
	
}
