package com.example.demo.testcontroller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/v1")
@RestController
public class HelloController {
      @GetMapping("/test")
      public String sayHello() {
          return "Hello, World!";
      }

}
