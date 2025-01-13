package org.example;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;


public class MyMinTest {
    @Test
    public void testPositive() {
        int out = MyMin.min(1, 2);
        Assertions.assertEquals(1, out);
    }

    @Test
    public void testNegative() {
        int out = MyMin.min(-1, -2);
        Assertions.assertEquals(-2, out);
    }

       @Test
    public void testNegativeBroken() {
        int out = MyMin.min(-1, -2);
        assertEquals(-3, out);
    }
}
