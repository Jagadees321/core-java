package leetcode;

import java.util.ArrayList;

class R {
    public int removeElement(int[] nums, int val) {
       int k = 0; // This will be the index for the elements not equal to val
        
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                // If the current element is not equal to val, swap it with the element at index k
                int temp = nums[i];
                nums[i] = nums[k];
                nums[k] = temp;
                
                k++; // Increment k to move to the next index for elements not equal to val
            }
        }
       return k; 
    }
    
        public int removeDuplicates(int[] nums) {
            int j = 1;
            for (int i = 1; i < nums.length; i++) {
                if (nums[i] != nums[i - 1]) {
                    nums[j] = nums[i];
                    j++;
                }
                
            }
            return j;
        }
    
}