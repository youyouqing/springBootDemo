package com.dzc.Http;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/prods")
public class Prods {

    @GetMapping("/test")
    public String test()
    {
        return "test";
    }
}
