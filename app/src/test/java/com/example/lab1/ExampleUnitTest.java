package com.example.lab1;

import org.junit.Test;

import static org.junit.Assert.*;
/*
public class ExampleUnitTest {
    @Test
    public void addition_isCorrect() {
        MainActivity t = new MainActivity();
       // @Test
        assertEquals(t.Min(4, 30), 4);
        assertEquals(t.Min(31, 3), 3);
        assertEquals(t.Min(50, 50), 50);
        assertEquals(t.Min(-4, 4), -4);

        assertEquals(t.Max(4, 30), 30);
        assertEquals(t.Max(31, 3), 31);
        assertEquals(t.Max(50, 50), 50);
        assertEquals(t.Max(-4, 4), 4);
    }
}*/
public class ExampleUnitTest {
    @Test
    public void Min1() { assertEquals(MainActivity.Min(4,30),4); }
    @Test
    public void Min2() { assertEquals(MainActivity.Min(31,3),3); }
    @Test
    public void Min3() { assertEquals(MainActivity.Min(4,4),4); }
    @Test
    public void Min4() { assertEquals(MainActivity.Min(-4,4),-4); }
    @Test
    public void Max1() { assertEquals(MainActivity.Max(4,30),30); }
    @Test
    public void Max2() { assertEquals(MainActivity.Max(31,3),31); }
    @Test
    public void Max3() { assertEquals(MainActivity.Max(4,4),4); }
    @Test
    public void Max4() { assertEquals(MainActivity.Max(-4,4),4); }
}