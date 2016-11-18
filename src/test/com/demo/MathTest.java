package com.demo;

import org.junit.Test;

import static com.demo.Math.*;
import static junit.framework.TestCase.*;
import static org.hamcrest.MatcherAssert.*;
import static org.hamcrest.Matchers.*;

public class MathTest {
    @Test
    public void normalTestWithoutAssertion() {
        System.out.println(3.1 == add(1.1, 2.0));
    }

    @Test
    public void testWithAssertion() {
        assertEquals(3.1, add(1.1, 2.0));
//      assertTrue(3.1 == add(1.1, 2.0));
    }

}

