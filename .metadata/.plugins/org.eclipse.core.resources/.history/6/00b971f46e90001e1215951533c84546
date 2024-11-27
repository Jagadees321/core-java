package leetcode;

import java.util.Arrays;

public class ThreeSumClosest {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int closestSum = nums[0] + nums[1] + nums[2];

        for (int i = 0; i < nums.length - 2; i++) {
            int left = i + 1;
            int right = nums.length - 1;

            while (left < right) {
                int currentSum = nums[i] + nums[left] + nums[right];
                int currentDiff = Math.abs(currentSum - target);
                int closestDiff = Math.abs(closestSum - target);

                if (currentDiff < closestDiff) {
                    closestSum = currentSum;
                }

                if (currentSum < target) {
                    left++;
                } else if (currentSum > target) {
                    right--;
                } else {
                    // If the sum is exactly equal to the target, return it.
                    return currentSum;
                }
            }
        }

        return closestSum;
    }

    public static void main(String[] args) {
        ThreeSumClosest threeSumClosest = new ThreeSumClosest();

        int[] nums1 = {-1, 2, 1, -4};
        int target1 = 1;
        System.out.println(threeSumClosest.threeSumClosest(nums1, target1));  // Output: 2

        int[] nums2 = {0, 0, 0};
        int target2 = 1;
        System.out.println(threeSumClosest.threeSumClosest(nums2, target2));  // Output: 0
    }
}
