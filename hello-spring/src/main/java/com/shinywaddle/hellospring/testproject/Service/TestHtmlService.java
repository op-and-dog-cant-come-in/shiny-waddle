package com.shinywaddle.hellospring.testproject.Service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;


@Slf4j
@Service
public class TestHtmlService {
    public String testHtml() {
        return "testHtml";
    }

    // 每5秒执行一次
    @Scheduled(fixedRate = 5000)
    public void reportCurrentTime() {
        log.info("The time is now {}", LocalDateTime.now());
    }
}
