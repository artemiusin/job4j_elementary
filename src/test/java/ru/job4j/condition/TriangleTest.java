package ru.job4j.condition;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

class TriangleTest {

    @Test
    void whenExist() {
        double ab = 2.0;
        double ac = 2.0;
        double bc = 2.0;
        boolean output = Triangle.exist(ab, ac, bc);
        assertThat(output).isTrue();
    }

    @Test
    void whenNotExist() {
        double ab = 1.0;
        double ac = 1.0;
        double bc = 2.0;
        boolean output = Triangle.exist(ab, ac, bc);
        assertThat(output).isFalse();
    }

}