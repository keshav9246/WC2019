package com.cricket.wc2019.Controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class welcomeController {

    @RequestMapping("/welcome")
    public String welcome()
    {
        return "Aaao Bhosdikey";
    }
}
