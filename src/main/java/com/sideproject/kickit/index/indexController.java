package com.sideproject.kickit.index;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class indexController {

  @RequestMapping("/hello")
  public String hello() {
    return "/pages/hello";
  }

}
