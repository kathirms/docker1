package com.example.docker.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Hello {
  @RequestMapping(value = "/hello", method = RequestMethod.GET)
  public String  getString() {
      return " sss i am finish this i got it  completed this final";
  }
}
