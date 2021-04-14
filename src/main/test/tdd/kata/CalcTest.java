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
        Integer actual = calc.sum("1,");
        Integer expected = -1;
        assertEquals(expected,actual);
    }
    @Test
    void sumOfLiterals() {
        Integer actual = calc.sum("hello,world");
        Integer expected = -1;
        assertEquals(expected,actual);
    }
    @Test
    void DigitCommaCommaDigit() {
        Integer actual = calc.sum("1,,2");
        Integer expected = -1;
        assertEquals(expected,actual);
    }
    @Test
    void lineBreakComaDigit() {
        Integer actual = calc.sum("\n,1,2");
        Integer expected = -1;
        assertEquals(expected,actual);
    }
    @Test
    void ComaLineBreakDigit() {
        Integer actual = calc.sum(",\n1");
        Integer expected = -1;
        assertEquals(expected,actual);
    }
    @Test
    void ComaLineBreakComa() {
        Integer actual = calc.sum(",\n,");
        Integer expected = -1;
        assertEquals(expected,actual);
    }
    @Test
    void LineBreakLineBreakComaDigit() {
        Integer actual = calc.sum("\n\n");
        Integer expected = -1;
        assertEquals(expected,actual);
    }
    @Test
    void DigitLineBreakDigitLineBreakDigitLineBreakDigitLineBreak() {
        Integer actual = calc.sum("1\n2\n3\n4");
        Integer expected = 10;
        assertEquals(expected,actual);
    }
    @Test
    void DigitComaDigitLineBreakDigitLineBreakDigitLineBreak() {
        Integer actual = calc.sum("1,2\n3\n4");
        Integer expected = 10;
        assertEquals(expected,actual);
    }
}