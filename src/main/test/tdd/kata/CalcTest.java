package tdd.kata;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

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
        Integer expected = 0;
        assertEquals(expected,actual);
    }
    @Test
    void sumOfOne() {
        Integer actual = calc.sum("1");
        Integer expected = 0;
        assertEquals(expected,actual);
    }
    @Test
    void sumOfTwoNegative() {
        Integer actual = calc.sum("-1,-2");
        Integer expected = 0;
        assertEquals(expected,actual);
    }
    @Test
    void sumOfOneNegative() {
        Integer actual = calc.sum("1,-2");
        Integer expected = 0;
        assertEquals(expected,actual);
    }
    @Test
    void sumOfLiterals() {
        Integer actual = calc.sum("a,b");
        Integer expected = 0;
        assertEquals(expected,actual);
    }

}