package com.huseyink.unittest.tests;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FizzBuzzTest {


    private FizzBuzz fizzBuzz;

    @BeforeEach
    void setUp() {
        fizzBuzz = new FizzBuzz();
    }

    @Test
    void returnFizzWhenTheNumberIsDividedByThree(){
        assertEquals("Fizz", fizzBuzz.stringFor(9));
    }

    @Test
    void returnBuzzWhenTheNumberIsDividedByFive(){
        assertEquals("Buzz",fizzBuzz.stringFor(5));
    }

    @Test
    void whenTheNumberIsDividedBothOfThreeAndFive(){
        assertEquals("FizzBuzz",fizzBuzz.stringFor(30));
    }

    @Test
    void returnNumberItself()
    {
        assertEquals("7",fizzBuzz.stringFor(7));
    }

}
