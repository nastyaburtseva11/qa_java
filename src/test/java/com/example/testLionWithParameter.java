package com.example;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class testLionWithParameter {

        private final String sex;
        private final boolean expected;

        public testLionWithParameter(String sex, boolean expected) {
            this.sex = sex;
            this.expected = expected;
        }

    @Parameterized.Parameters
    public static Object[][] getLionData() {
        return new Object[][]{
                {"Самец", true},
                {"Самка", false},
        };
    }
        @Test
        public void TestLionWithParameter() throws Exception {
            Feline feline = new Feline();
            Lion lion = new Lion(sex, feline);
            boolean actual = lion.doesHaveMane();
            assertEquals(expected, actual);
        }
    }
