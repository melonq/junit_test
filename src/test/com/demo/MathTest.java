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

    @Test
    public void testWithAssertionAndMatcher() {
        assertThat(3.1, equalTo(add(1.1, 2.0)));
    }

    @Test
    public void shouldReturnCorrectInteger() throws Exception {
        assertEquals(123, parseInt("123"));
    }

    @Test
    public void shouldThrowExceptionWhenInputAnInvalidString() throws Exception {
        try {
            parseInt("123a");
            fail("whatever");
        } catch (Exception e) {
            assertThat(e instanceof NumberFormatException, is(true));
        }
    }
}



//    常用的Matcher:
//    a)         assertThat( n, allOf( greaterThan(1), lessThan(15) ) );
//    assertThat( 33, anyOf( greaterThan(16), lessThan(8) ) );
//    assertThat("fab", both(containsString("a")).and(containsString("b")))
//    assertThat( 12, anything() );
//    assertThat( str, is( "bjsxt" ) );
//    assertThat( str, not( "bjxxt" ) );
//
//    b)        assertThat( str, containsString( "bjsxt" ) );
//    assertThat( str, endsWith("bjsxt" ) );
//    assertThat( str, startsWith( "bjsxt" ) );
//    assertThat( n, equalTo( nExpected ) );
//    assertThat( str, equalToIgnoringCase( "bjsxt" ) );
//    assertThat( str, equalToIgnoringWhiteSpace( "bjsxt" ) );
//
//    c)         assertThat( d, closeTo( 3.0, 0.3 ) );
//    assertThat( d, greaterThan(3.0) );
//    assertThat( d, lessThan (10.0) );
//    assertThat( d, greaterThanOrEqualTo (5.0) );
//    assertThat( d, lessThanOrEqualTo (16.0) );
//
//    d)        assertThat( map, hasEntry( "bjsxt", "bjsxt" ) );
//    assertThat( iterable, hasItem ( "bjsxt" ) );
//    assertThat( map, hasKey ( "bjsxt" ) );
//    assertThat( map, hasValue ( "bjsxt" ) );
