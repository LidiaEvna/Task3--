package com.company;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    void main() {
        assertEquals(5*10, Main.multiply(5,10));
    }
    @Test
    void main2() {

        assertEquals(5*-2, Main.multiply(5,-2));
    }
    @Test
    void main3() {

        assertEquals(0*9, Main.multiply(0,9));
    }
}