package com.springboot.first.app;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

//@Controller
//@ResponseBody // HTTP Message converters to convert the return value to HTTP response body

@RestController// @RestController ထဲမှာ @Controller ကော @ResponseBody ကောပါပြီးသား
public class HelloWorldController {

    // GET HTTP Method
    // http://localhost:8090/hello-world
    @GetMapping("/hello-world")
    public  String HelloWorld(){
        return "Hello World";
    }


}
