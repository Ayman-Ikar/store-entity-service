package com.store.entityservice.controllers;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class TestController {

    @RequestMapping("/hello")
    public String greeting() {
        log.info("Here is a CALL. yay!!");
        return "Hey there";
    }
}
