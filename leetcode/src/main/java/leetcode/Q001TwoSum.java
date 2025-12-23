package leetcode;

import java.util.Arrays;

// https://leetcode.com/problems/two-sum/
public class Q001TwoSum {
    public int[] twoSum(int[] nums, int target) {
        for (int i1 = 0; i1 <= nums.length - 2; i1++) {
            for (int i2 = i1 + 1; i2 <= nums.length - 1; i2++) {
                int n1 = nums[i1];
                int n2 = nums[i2];
                int sum = n1 + n2;

                if (sum == target) {
                    return new int[]{i1, i2};
                }
            }
        }

        return null;
    }

    public static void main(String[] args) {
        int[] nums = {2,7,11,15};
        int target = 9;

        Q001TwoSum instance = new Q001TwoSum();
        int[] ret = instance.twoSum(nums, target);
        System.out.println(Arrays.toString(ret));
    }
}
