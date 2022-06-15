package com.company;

import org.testng.annotations.Test;

import static org.junit.Assert.*;

public class testTest {

    @Test
    public void sum() {
        test numbers = new test();
        int actual = numbers.sum(12);
        int expected = 78;
        assertEquals(actual,expected);
    }
}