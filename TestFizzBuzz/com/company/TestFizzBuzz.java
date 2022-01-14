package com.company;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TestFizzBuzz {
    @Test
    @DisplayName("Test number division by three return Fizz")
    void testNumberDivisionByThree(){
        String expected = FizzBuzz.FIZZ;
        String actual = FizzBuzz.getFizz(3);
        assertEquals(expected, actual);
    }
    @Test
    @DisplayName("Test number division by five return Buzz")
    void testNumberDivisionByFive(){
        String expected = FizzBuzz.BUZZ;
        String actual = FizzBuzz.getFizz(5);
        assertEquals(expected, actual);

    }

    @Test
    @DisplayName("")
    void testNumberDivisionByFiveAndThree(){
        String expected = FizzBuzz.FIZZ_BUZZ;
        String actual = FizzBuzz.getFizz(15);
        assertEquals(expected, actual);
    }
    @Test
    @DisplayName("")
    void testNumberNotDivisionByFiveAndThree(){
        String expected = "1";
        String actual = FizzBuzz.getFizz(1);
        assertEquals(expected, actual);
    }

}
