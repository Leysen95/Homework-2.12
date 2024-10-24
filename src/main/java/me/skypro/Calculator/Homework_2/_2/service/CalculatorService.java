package me.skypro.Calculator.Homework_2._2.service;

import org.springframework.stereotype.Service;

@Service
public class CalculatorService {

    public int getSummary(Integer num1, Integer num2) {
        if (num1 == null || num2 == null) {
            throw new IllegalArgumentException("Один из параметров не передан");
        }
        return num1 + num2;
    }

    public int getSubstract(Integer num1, Integer num2) {
        if (num1 == null || num2 == null) {
            throw new IllegalArgumentException("Один из параметров не передан");
        }
        return num1 - num2;
    }

    public int getMultiply(Integer num1, Integer num2) {
        if (num1 == null || num2 == null) {
            throw new IllegalArgumentException("Один из параметров не передан");
        }
        return num1 * num2;
    }

    public int getDivide(Integer num1, Integer num2) {
        if (num1 == null || num2 == null) {
            throw new IllegalArgumentException("Один из параметров не передан");
        }
        if (num2 == 0) {
            throw new IllegalArgumentException("Деление на 0 запрещено");
        }
        return num1 / num2;
    }
}
