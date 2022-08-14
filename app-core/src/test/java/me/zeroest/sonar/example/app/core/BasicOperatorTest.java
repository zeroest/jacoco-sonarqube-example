package me.zeroest.sonar.example.app.core;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BasicOperatorTest {

    @Disabled
    @Test
    void applyDefault() {
        // given
        int x = 1;
        int y = 2;

        // when
        int apply = BasicOperator.apply(Operation.TIMES, x, y);

        // then
        assertEquals(0, apply);
    }

    @Disabled
    @Test
    void applyPlus() {
        // given
        int x = 1;
        int y = 2;

        // when
        int apply = BasicOperator.apply(Operation.PLUS, x, y);

        // then
        assertEquals(x + y, apply);
    }

    @Disabled
    @Test
    void applyMinus() {
        // given
        int x = 1;
        int y = 2;

        // when
        int apply = BasicOperator.apply(Operation.MINUS, x, y);

        // then
        assertEquals(x - y, apply);
    }

}