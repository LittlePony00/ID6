package com.zaurtregulov.spring.test;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class CalculatorTest {

    SimpleCalculator simpleCalculator = new SimpleCalculator();

    @Test
    public void testSumTwoNumbers() {
        assertEquals(2.7, simpleCalculator.sumTwoNumbers(1.5, 1.2));
    }

    @Test
    public void testMultiplyTwoNumbers() {
        assertEquals(8d, simpleCalculator.multiplyTwoNumbers(2, 4));
    }

    @Test
    public void testDivideOneNumberByAnother() {
        assertEquals(2d, simpleCalculator.divideOneNumberByAnother(8, 4));
    }

    @Test
    public void testMinusOneNumberFromAnother() {
        assertEquals(0d, simpleCalculator.minusOneNumberFromAnother(5, 5));
    }

    @Test
    public void testDivideOneNumberByAnotherWithZeroAsSecondNumber() {
        assertEquals(-1d, simpleCalculator.divideOneNumberByAnother(5, 0));
    }
}
