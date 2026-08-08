package dsa.recursion;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SumOfListTest {
    @Test
    void negativeSums() {
        SumOfList instance = new SumOfList();

        assertEquals(2, instance.sumOfList(new int[] {2, 5, -5}));
    }

    @Test
    void sums() {
        SumOfList instance = new SumOfList();

        assertEquals(6, instance.sumOfList(new int[] {2, -5, -5, 15, -1}));
    }

    @Test
    void oneValue() {
        SumOfList instance = new SumOfList();

        assertEquals(2, instance.sumOfList(new int[]{2}));
    }
}