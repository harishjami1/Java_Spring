package com.example.demo1;

import java.security.Principal;
import java.util.Map;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.oauth2.client.EnableOAuth2Sso;
import org.springframework.security.oauth2.provider.OAuth2Authentication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@EnableOAuth2Sso
public class Demo1Application {
	@GetMapping("/")
	public String welcome(Principal principal)

	{	System.out.println("Entered");
		Map<String,Object> details= (Map<String, Object>) ((OAuth2Authentication) principal).getUserAuthentication().getDetails();
		return "Hi  "+ details.get("name")+",Welcome";
	}

	public static void main(String[] args) {
		SpringApplication.run(Demo1Application.class, args);
	}

}
