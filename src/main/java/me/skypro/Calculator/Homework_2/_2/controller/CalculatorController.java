package me.skypro.Calculator.Homework_2._2.controller;

import me.skypro.Calculator.Homework_2._2.service.CalculatorService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/calculator")
public class CalculatorController {

    private final CalculatorService calculatorService;

    public CalculatorController(CalculatorService calculatorService) {
        this.calculatorService = calculatorService;
    }

    @GetMapping
    public String getHello() {
        return "Добро пожаловать";
    }

    @GetMapping("/plus")
    public String getSummary(@RequestParam(value = "num1", required = false) Integer num1,
                             @RequestParam(value = "num2", required = false) Integer num2) {
        int result = calculatorService.getSummary(num1, num2);
        return num1 + " + " + num2 + " = " + result;
    }

    @GetMapping("/minus")
    public String getSubstraction(@RequestParam(value = "num1", required = false) Integer num1,
                                  @RequestParam(value = "num2", required = false) Integer num2) {
        int result = calculatorService.getSubstract(num1, num2);
        return num1 + " - " + num2 + " = " + result;
    }

    @GetMapping("/multiply")
    public String getMultiplication(@RequestParam(value = "num1", required = false) Integer num1,
                              @RequestParam(value = "num2", required = false) Integer num2) {
        int result = calculatorService.getMultiply(num1, num2);
        return num1 + " * " + num2 + " = " + result;
    }

    @GetMapping("/divide")
    public String getDivision(@RequestParam(value = "num1", required = false) Integer num1,
                              @RequestParam(value = "num2", required = false) Integer num2) {
        int result = calculatorService.getDivide(num1, num2);
        return num1 + " / " + num2 + " = " + result;
    }
}
