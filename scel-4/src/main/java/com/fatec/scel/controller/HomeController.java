package com.fatec.scel.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HomeController {


@RequestMapping(value="/menu", method= RequestMethod.GET)
public String home(){
 
return "menu";
}
}
