package com.shinywaddle.hellospring.testproject.Controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class TestResponseBodyController {

    @GetMapping("test")
    public String testController() {
        log.info("testController has done!");
        return "test";
    }
}
