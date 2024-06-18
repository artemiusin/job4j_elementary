package ru.job4j.condition;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;

class MaxTest {

    @Test
    void when1To3Then3() {
        int left = 1;
        int right = 3;
        int output = Max.max(left, right);
        int expected = 3;
        assertThat(output).isEqualTo(expected);
    }

    @Test
    void when2To1Then2() {
        int left = 2;
        int right = 1;
        int output = Max.max(left, right);
        int expected = 2;
        assertThat(output).isEqualTo(expected);
    }

    @Test
    void when1To1Then1() {
        int left = 1;
        int right = 1;
        int output = Max.max(left, right);
        int expected = 1;
        assertThat(output).isEqualTo(expected);
    }
}