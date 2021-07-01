package com.sr.cgi;


import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

public class CalculateTest {
    private static Calculate cal;

    @BeforeAll
    static void setUpAll() {
        cal = new Calculate();
    }

    @AfterAll
    static void tearDownAll() {
        cal = null;
    }

    @ParameterizedTest
    @CsvSource({"1,2,3", "2,3,5", "3,4,7", "4,5,9", "5,6,11"})
    void givenTwoNumShouldReturnSum(int num1, int num2, int sum) {
        int result = cal.addSum(num1, num2);
        assertEquals(sum, result);
    }

    @ParameterizedTest
    @ValueSource(ints = {2, 4, 6, 8, 10, 12, 14, 16})
    void givenEvenNumShouldReturnFalse(int num) {
        boolean result = cal.isEven(num);
        assertTrue(result);
    }

    @ParameterizedTest
    @ValueSource(ints = {1, 3, 5, 7, 9, 11, 13, 15})
    void givenOddNumShouldReturnFalse(int num) {
        boolean result = cal.isEven(num);
        assertFalse(result);
    }

    @ParameterizedTest
    @CsvSource({"21,false", "22,true", "23,false", "24,true", "25,false", "26,true", "27,false", "28,true"})
    void givenEvenOddNumShouldReturnAppropriateResult(int num, boolean check) {
        boolean result = cal.isEven(num);
        assertEquals(check, result);
    }
}