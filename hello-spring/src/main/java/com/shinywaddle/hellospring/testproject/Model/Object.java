package com.shinywaddle.hellospring.testproject.Model;


import org.springframework.scheduling.annotation.Scheduled;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;


public class Object {
    String name;

    int id;

    LocalDateTime expireTime;

    @Scheduled()
    public static void main(String[] args) {
        long currentTimeMillis = System.currentTimeMillis();
        LocalDateTime time = LocalDateTime.parse("2025-08-25", DateTimeFormatter.ofPattern("yyyy-MM-dd"));
        List<String> list = List.of("1", "2", "3");
    }
}

