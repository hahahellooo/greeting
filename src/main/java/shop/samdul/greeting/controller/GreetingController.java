package shop.samdul.greeting.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import shop.samdul.greeting.People;
import java.util.Stack;

@Controller
public class GreetingController {
	Stack<String> names = new Stack<>();
    @GetMapping("/greeting")
    public String greeting(@RequestParam(name="name", required=false, defaultValue="HI") String name, Model model) {
            names.push(name);
            model.addAttribute("names", names);
            return "greeting";
    }

	private Stack<People> nameStack = new Stack<>();
  
    @GetMapping("/people")	
    public String pgreeting(@RequestParam(name="name", required=false, defaultValue="HI") String name, Model model) {
		
		People p = new People();
		if (!nameStack.isEmpty()) {
			People pp = nameStack.peek();
			p.setNum(pp.getNum() + 1);
		} else {
				p.setNum(1);
		}
		p.setName(name.toLowerCase());
		nameStack.push(p);
		model.addAttribute("nameStack", nameStack);
		
		return "people";
  }
}