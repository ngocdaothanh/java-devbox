package dsa.recursion;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CountdownTest {
    @Test
    void countdownFrom5() {
        Countdown instance = new Countdown();

        assertEquals("blastoff!!", instance.f(5));
    }

    @Test
    void negative_n() {
        Countdown instance = new Countdown();

        assertEquals("blastoff!!", instance.f(-20));
    }
}