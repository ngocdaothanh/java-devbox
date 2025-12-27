package leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class Q001TwoSumTest {
    @Test
    void twoSum() {
        Q001TwoSum instance = new Q001TwoSum();

        int[] nums = {2, 7, 11, 15};
        int target = 9;
        int[] expected = {0, 1};
        assertArrayEquals(expected, instance.twoSum(nums, target));
    }
}