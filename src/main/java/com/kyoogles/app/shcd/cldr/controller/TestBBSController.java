package com.kyoogles.app.shcd.cldr.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/ca")
public class TestBBSController {

	@RequestMapping(value = "/testBBS", method =  {RequestMethod.GET, RequestMethod.POST})
	  public String testBBS(Model model) {
	    System.out.println("test 페이지 들어 옴.");

	    return "/ca/testBBS";
	  }

}
