package com.example.calculator;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;

@RestController
@SpringBootApplication
public class CalculatorApplication {

    public static void main(String[] args) {
        SpringApplication.run(CalculatorApplication.class, args);
    }

    @GetMapping("/add")
    public String add(@RequestParam double a, @RequestParam double b) {
        return "Result: " + (a + b);
    }

    @GetMapping("/subtract")
    public String subtract(@RequestParam double a, @RequestParam double b) {
        return "Result: " + (a - b);
    }

    @GetMapping("/multiply")
    public String multiply(@RequestParam double a, @RequestParam double b) {
        return "Result: " + (a * b);
    }

    @GetMapping("/divide")
    public String divide(@RequestParam double a, @RequestParam double b) {
        if (b == 0) {
            return "Error: Division by zero is not allowed.";
        }
        return "Result: " + (a / b);
    }
}
