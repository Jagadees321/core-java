package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSum {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums);

        for (int i = 0; i < nums.length - 2; i++) {
            // Skip duplicate elements
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }

            int left = i + 1;
            int right = nums.length - 1;

            while (left < right) {
                int total = nums[i] + nums[left] + nums[right];

                if (total < 0) {
                    left++;
                } else if (total > 0) {
                    right--;
                } else {
                    result.add(Arrays.asList(nums[i], nums[left], nums[right]));

                    // Skip duplicate elements
                    while (left < right && nums[left] == nums[left + 1]) {
                        left++;
                    }
                    while (left < right && nums[right] == nums[right - 1]) {
                        right--;
                    }

                    left++;
                    right--;
                }
            }
        }

        return result;
    }

    public static void main(String[] args) {
        ThreeSum threeSum = new ThreeSum();

        int[] nums1 = {-1, 0, 1, 2, -1, -4};
        System.out.println(threeSum.threeSum(nums1));  // Output: [[-1, -1, 2], [-1, 0, 1]]

        int[] nums2 = {0, 1, 1};
        System.out.println(threeSum.threeSum(nums2));  // Output: []

        int[] nums3 = {0, 0, 0};
        System.out.println(threeSum.threeSum(nums3));  // Output: [[0, 0, 0]]
    }
}

