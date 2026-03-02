package dsa.recursion;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class sumOfListTest {
    @Test
    void negativeSums() {
        sumOfList instance = new sumOfList();

        assertEquals(2, instance.sumOfList(new int[] {2, 5, -5}));
    }

    @Test
    void sums() {
        sumOfList instance = new sumOfList();

        assertEquals(6, instance.sumOfList(new int[] {2, -5, -5, 15, -1}));
    }

    @Test
    void oneValue() {
        sumOfList instance = new sumOfList();

        assertEquals(2, instance.sumOfList(new int[]{2}));
    }
}