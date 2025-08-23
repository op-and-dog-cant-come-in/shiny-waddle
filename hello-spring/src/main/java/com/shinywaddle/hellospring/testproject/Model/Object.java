package com.shinywaddle.hellospring.testproject.Model;


import lombok.extern.slf4j.Slf4j;
import org.springframework.scheduling.annotation.Scheduled;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;


/**
 * 是
 */
@Slf4j
public class Object {
    String name;

    int id;

    LocalDateTime expireTime;

    @Scheduled()
    public static void main(String[] args) {
        long currentTimeMillis = System.currentTimeMillis();
        LocalDate time = LocalDate.parse("2025-08-25", DateTimeFormatter.ofPattern("yyyy-MM-dd"));
        List<String> list = List.of("1", "2", "3");
        log.info("{}", time);
    }
}

