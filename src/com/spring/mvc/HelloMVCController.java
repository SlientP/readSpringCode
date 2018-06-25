package com.spring.mvc;

import com.spring.mvc.test.bean.Default.BeanFactoryTest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HelloMVCController {
	@RequestMapping(value="/hello",method = RequestMethod.GET)
	public String printWelcome(ModelMap model) {
		BeanFactoryTest test=new BeanFactoryTest();
		model.addAttribute("msg",test.testSimpleload());
		return "index";
	}
}