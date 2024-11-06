package com.kpanuiczka.kiki;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.time.LocalDate;



@RestController
@RequestMapping("/api")
public class Controller {

    @GetMapping
    public String test() {
        return "Katin des bois";
    }

    @PostMapping
    public String testEnPost() {
        return "Katin des bois";
    }

    @GetMapping("/hello")
    public String sayHello() {
        return "Hello, World!";
    }

    @GetMapping("/hello/{name}")
    public String sayHelloToName(@PathVariable String name) {
        return "Hello, " + name + "!";
    }

    @GetMapping("/hello/{name}/{naissance}") 
    public String sayHelloToNameAndAge(@PathVariable String name, @PathVariable int naissance) {
        return "Hello, " + name + "! You are " + (LocalDate.now().getYear() - naissance) + " years old.";
    }
    

    // @GetMapping("biere/")
    // public String getAllBiere() {
    //     return
    // }
}
