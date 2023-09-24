package org.example.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Jack
 * @Desc
 * @Date 2023/9/24/16:42:24
 **/
@RestController
public class HelloController {
    @GetMapping("/test")
    public String test() {
        return "hello";
    }
}
