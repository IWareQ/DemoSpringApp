package ru.iwareq.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {

	@GetMapping("/")
	public String onIndex(Model model) {
		model.addAttribute("name", "Dima");
		return "index";
	}
}
