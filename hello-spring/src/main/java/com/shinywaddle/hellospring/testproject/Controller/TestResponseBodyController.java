package com.shinywaddle.hellospring.testproject.Controller;

import com.alibaba.fastjson2.JSONObject;
import com.shinywaddle.hellospring.testproject.Service.TestHtmlService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
@Slf4j
public class TestResponseBodyController {
    @Autowired
    public TestHtmlService testHtmlService;

    @GetMapping("/test")
    public ResponseEntity<String> testController(@RequestParam String name) {
        log.info("testController has done! name: {}", name);
        String string = testHtmlService.testHtml(name);
        return ResponseEntity.ok(string);
    }

    @PostMapping("/post")
    public String postController(@RequestBody JSONObject jsonObject) {
        log.info("postController has done! name: {}", jsonObject);
        return jsonObject.toJSONString();
    }
}