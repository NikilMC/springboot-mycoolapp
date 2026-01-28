package com.test.mycoolapp.rest;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FunRestController {
    @Value("${name}")
    public String Name;

    @Value("${word}")
    public String Word;

    //expose new endpoint for "name"
    @GetMapping("/nameinfo")
    public String getName(){
        return "Name : "+Name;
    }

    //expose new endpoint for "word"
    @GetMapping("/wordinfo")
    public String getWord(){
        return "Word : "+Word;
    }

    @GetMapping("/")
    public String sayHello(){
        return "Hello World";
    }
    @GetMapping("/Boom")
    public String sayBoom(){
        return "Boom";
    }
}
