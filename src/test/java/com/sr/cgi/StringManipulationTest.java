package com.sr.cgi;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

class StringManipulationTest {
    private static StringManipulation strMan;

    @BeforeAll
    static void setUpAll() {
        strMan = new StringManipulation();
    }

    @AfterAll
    static void tearDownAll() {
        strMan = null;
    }

    @ParameterizedTest
    @CsvSource({"Nilesh,2", "Rahul,2", "Angel,2", "Suvid,2", "Sachin,2"})
    void givenNameShouldReturnCorrectVowelCount(String name, int vowelCount) {
        int result = strMan.vowelCount(name);
        assertEquals(vowelCount, result);
    }

    @ParameterizedTest
    @CsvSource({"Naruto,6", "Sasuke,6", "MinatoKamikaze,14", "Kakashi,7", "Shikamaru,9"})
    void givenStringsShouldReturnCorrectCharacterCount(String str, int charCount) {
        int result = strMan.characterCount(str);
        assertEquals(charCount, result);
    }
}