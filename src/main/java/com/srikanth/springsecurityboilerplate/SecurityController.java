package com.srikanth.springsecurityboilerplate;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SecurityController {

    @GetMapping("/get")
    public String getAccess() {
        return "you-got-it-covered-with-SS";
    }

    @PostMapping("/set")
    public String setAccess() {
        return "you-need-work-on-it";
    }
}
