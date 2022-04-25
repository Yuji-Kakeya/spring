package local.kakeya.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.ui.Model;
import local.kakeya.demo.model.Demo;


@Controller
public class DemoController {
	@RequestMapping("/demo")
	public String demo(Demo model) {

		return "/demo";
	}
}