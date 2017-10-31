package com.wfy.spring.boot.controller;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/")
public class GirlControler {
	@RequestMapping("/girls")
	@ResponseBody
	public String girls() {
		return "beauty,lovely,sexy,sweet";
	}
	@RequestMapping("/girl")
	@ResponseBody
	public String girl(String type) {
		String girl = "anger";
		switch (type) {
		case "beauty":
			girl = "beauty";
			break;
		case "lovely":
			girl = "lovely";
			break;
		case "sexy":
			girl = "sexy";
			break;
		case "sweet":
			girl = "sweet";
			break;

		default:
			break;
		}
		return girl;
	}

}
