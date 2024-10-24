package me.skypro.Calculator.Homework_2._2.service;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Random;
import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThatExceptionOfType;
import static org.junit.jupiter.api.Assertions.*;

class CalculatorServiceTest {
    private final CalculatorService calculatorService = new CalculatorService();
    private static final Random RANDOM = new Random();

    @Test
    @DisplayName("Корректно складывает 2 параметра")
    void getSummary() {
        int a = 5;
        int b = 5;
        int actual = a + b;

        int expected = calculatorService.getSummary(a, b);
        assertEquals(expected, actual);
    }

    @ParameterizedTest
    @MethodSource("provideDifferentNullParams")
    @DisplayName("Корректно проверяет пустые параметры в сложении")
    void getSummaryThrowException(String message, Integer a, Integer b) {
        assertThatExceptionOfType(IllegalArgumentException.class)
                .isThrownBy(() -> calculatorService.getSummary(a, b));
    }

    @Test
    @DisplayName("Корректно вычитает параметры")
    void getSubstract() {
        int a = 5;
        int b = 5;
        int actual = a - b;

        int expected = calculatorService.getSubstract(a, b);
        assertEquals(expected, actual);
    }

    @ParameterizedTest
    @MethodSource("provideDifferentNullParams")
    @DisplayName("Корректно проверяет пустые параметры в вычитании")
    void getSubstractionThrowException(String message, Integer a, Integer b) {
        assertThatExceptionOfType(IllegalArgumentException.class)
                .isThrownBy(() -> calculatorService.getSubstract(a, b));
    }

    @Test
    @DisplayName("Корректно умножает 2 параметра")
    void getMultiply() {
        int a = 5;
        int b = 5;
        int actual = a * b;

        int expected = calculatorService.getMultiply(a, b);
        assertEquals(expected, actual);
    }

    @ParameterizedTest
    @MethodSource("provideDifferentNullParams")
    @DisplayName("Корректно проверяет пустые параметры в умножении")
    void getMultiplyThrowException(String message, Integer a, Integer b) {
        assertThatExceptionOfType(IllegalArgumentException.class)
                .isThrownBy(() -> calculatorService.getMultiply(a, b));
    }

    @Test
    @DisplayName("Корректно делит 2 параметра")
    void getDivide() {
        int a = 5;
        int b = 5;
        int actual = a / b;

        int expected = calculatorService.getDivide(a, b);
        assertEquals(expected, actual);
    }

    @ParameterizedTest
    @MethodSource("provideDifferentNullParams")
    @DisplayName("Корректно проверяет пустые параметры в делении")
    void getDivisionThrowException(String message, Integer a, Integer b) {
        assertThatExceptionOfType(IllegalArgumentException.class)
                .isThrownBy(() -> calculatorService.getDivide(a, b));
    }

    private static Stream<Arguments> provideDifferentNullParams() {
        return Stream.of(Arguments.of("Отсутствует первый параметр", null, RANDOM.nextInt()),
                Arguments.of("Отсутствует второй параметр", RANDOM.nextInt(), null),
        Arguments.of("Отсутствуют оба параметра", null, null));
    }
}