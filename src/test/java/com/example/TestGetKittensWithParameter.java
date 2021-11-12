package com.example;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class TestGetKittensWithParameter {

    private final int kittensCount;
    private final int expected;

    public TestGetKittensWithParameter(int kittensCount, int expected) {
        this.kittensCount = kittensCount;
        this.expected = expected;
    }

    @Parameterized.Parameters
    public static Object[][] getKittensCount() {
        return new Object[][]{
                {1, 1},
                {5, 5},
        };
    }

    @Test
    public void testGetKittens() {
        Feline feline = new Feline();
        int actual = feline.getKittens(kittensCount);
        assertEquals(expected, actual);
    }
}
