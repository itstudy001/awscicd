package com.adamsoft.awscicd;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FrontController {
    @RequestMapping("/")
    public String index() {
        return "HELLO AWS";
    }
}
