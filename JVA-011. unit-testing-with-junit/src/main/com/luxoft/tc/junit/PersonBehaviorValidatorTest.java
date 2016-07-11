package com.luxoft.tc.junit;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

@RunWith(JUnit4.class)
public class PersonBehaviorValidatorTest {
    @Test
    public void testLoginOk() {
        assertThat(1, is(1));
    }
}
