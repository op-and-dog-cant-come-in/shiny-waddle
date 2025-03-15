package com.shinywaddle.hellospring.testproject.Controller;

import com.shinywaddle.hellospring.testproject.Service.TestHtmlService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class TestResponseBodyController {
    @Autowired
    public TestHtmlService testHtmlService;

    @GetMapping("test")
    public String testController() {
        log.info("testController has done!");
        return testHtmlService.testHtml();
    }
}
