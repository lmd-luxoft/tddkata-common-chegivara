package tdd.kata;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.text.ParseException;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

class CalcTest {
    Calc calc ;
    @BeforeEach
    private void beforeEachTest(){
        calc=new Calc();
    }
    @Test
    void sumOfEmpty() {
        Integer actual = calc.sum("");
        Integer expected = 0;
        assertEquals(expected,actual);
    }
    @Test
    void sumOfTwo() {
        Integer actual = calc.sum("1,2");
        Integer expected = 3;
        assertEquals(expected,actual);
    }
    @Test
    void sumOfNegative() {
        Integer actual = calc.sum("-1,-2");
        Integer expected = -3;
        assertEquals(expected,actual);
    }
    @Test
    void sumOfOne() {
        Integer actual = calc.sum("1");
        Integer expected = 1;
        assertEquals(expected,actual);
    }
    @Test
    void sumOfDigitWithComma() {
        assertEquals(0,calc.sum("1,"));
    }
    @Test
    void sumOfLiterals() {
        assertEquals(0,calc.sum("hello,world"));
    }
    @Test
    void commaSum() {

        assertEquals(0,calc.sum("1,,2"));
    }
}