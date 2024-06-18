package ru.job4j.condition;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;

class PointTest {

    @Test
    void when00to20Then2() {
        int x1 = 0;
        int x2 = 2;
        int y1 = 0;
        int y2 = 0;
        double expected = 2;
        double output = Point.distance(x1, y1, x2, y2);
        assertThat(output).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void when11toMinus20Then3Dot16() {
        int x1 = 1;
        int x2 = -2;
        int y1 = 1;
        int y2 = 0;
        double expected = 3.16;
        double output = Point.distance(x1, y1, x2, y2);
        assertThat(output).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void whenMinus11toMinus20Then1Dot41() {
        int x1 = -1;
        int x2 = -2;
        int y1 = 1;
        int y2 = 0;
        double expected = 1.41;
        double output = Point.distance(x1, y1, x2, y2);
        assertThat(output).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void when11To11Then0() {
        int x1 = 1;
        int x2 = 1;
        int y1 = 1;
        int y2 = 1;
        double expected = 0;
        double output = Point.distance(x1, y1, x2, y2);
        assertThat(output).isEqualTo(expected, withPrecision(0.01));
    }
}