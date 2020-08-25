package com.example.demo3.controller;

import com.example.demo3.repository.TestRepo;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
@RequiredArgsConstructor
public class Controller {
    private final TestRepo repo;

    @GetMapping
    void get() {
        log.info(">>> get");
        repo.put();
    }
}
