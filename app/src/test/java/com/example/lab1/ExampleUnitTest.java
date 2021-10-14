package com.example.lab1;

import org.junit.Test;

import static org.junit.Assert.*;

public class ExampleUnitTest {
    @Test
    public void addition_isCorrect() {
        MainActivity t = new MainActivity();

        assertEquals(t.Min(4, 30), 4);
        assertEquals(t.Min(31, 3), 3);
        assertEquals(t.Min(50, 50), 50);
        assertEquals(t.Min(-4, 4), -4);

        assertEquals(t.Max(4, 30), 30);
        assertEquals(t.Max(31, 3), 31);
        assertEquals(t.Max(50, 50), 50);
        assertEquals(t.Max(-4, 4), 4);
    }
}