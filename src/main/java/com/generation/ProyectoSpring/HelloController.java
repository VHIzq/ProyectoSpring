package com.generation.ProyectoSpring;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class HelloController {
    @GetMapping("/")
    public String index() {
        return "I'm Victor Izquierdo and Happy Xmas";
    }
}
