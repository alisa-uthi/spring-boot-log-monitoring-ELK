package com.alisa.logELK.controller;

import com.alisa.logELK.model.Person;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;

@RestController
@Slf4j
public class HomeController {
    @GetMapping("/")
    public String HomePage(){
        Person p = new Person("Alisa", 23);
        log.info("This is INFO log with object:  {} ", p);
        return "This is INFO log";
    }

    @GetMapping("/debug")
    public String ObjPage(){
        LocalDateTime localDateTime = LocalDateTime.now();
        log.debug("This is DEBUG log  {}", localDateTime);
        return "This is DEBUG log ";
    }

    @GetMapping("/warn")
    public String WarnPage(){
        LocalDateTime localDateTime = LocalDateTime.now();
        log.warn("This is WARN log " + localDateTime);
        return "This is WARN log";
    }

    @GetMapping("/err")
    public String ErrorPage(){
        LocalDateTime localDateTime = LocalDateTime.now();
        log.error("This is ERROR log " + localDateTime);
        throw new RuntimeException("An error occurred!!!!!");
    }
}
