package com.infnet.spring.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/calculadora")
public class controller {

    @GetMapping("/adicao")
    public double adicao(@RequestParam double a, @RequestParam double b) {
        return a + b;
    }

    @GetMapping("/subtracao")
    public double subtracao(@RequestParam double a, @RequestParam double b) {
        return a - b;
    }

    @GetMapping("/multiplicacao")
    public double multiplicacao(@RequestParam double a, @RequestParam double b) {
        return a * b;
    }

    @GetMapping("/divisao")
    public double divisao(@RequestParam double a, @RequestParam double b) {
        if (b == 0) {
            throw new IllegalArgumentException("Divisão por zero não é permitida");
        }
        return a / b;
    }

    @GetMapping("/exponenciacao")
    public double exponenciacao(@RequestParam double base, @RequestParam double expoente) {
        return Math.pow(base, expoente);
    }
}