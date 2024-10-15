package shop.samdul.greeting.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import ch.qos.logback.core.model.Model;

@Controller 
public class GreetingController {
	@GetMapping("/greeting")
	public String greeting(
			@RequestParam(
				name="name",
				required=false,
				defaultValue="HI") String name, 
			Model model){
		
		return "greeting";

	}

}
