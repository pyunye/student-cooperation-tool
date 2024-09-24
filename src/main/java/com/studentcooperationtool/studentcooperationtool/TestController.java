package com.studentcooperationtool.studentcooperationtool;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @GetMapping("/api/v1/hello")
    public String reactTest(){
        return "hello";
    }

}
