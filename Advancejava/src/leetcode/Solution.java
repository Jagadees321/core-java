package leetcode;
import java.util.HashMap;

public class Solution {
    public int lengthOfLongestSubstring(String s) {
        // Create a HashMap to store the last index of each character
        HashMap<Character, Integer> h = new HashMap<>();
        int max_length = 0;
        int start = 0;

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            // If the character is already in the HashMap and its index is greater than or equal to the start of the window
            if (h.containsKey(c) && h.get(c) >= start) {
                start = h.get(c) + 1; // Move the start of the window to the next position after the repeated character
            }
            System.out.println("before  "+h);
            h.put(c, i); // Update the last occurrence index of the character
          //System.out.println("after  "+h);
           max_length = Math.max(max_length, i - start + 1); // Update the maximum length
        }

        return max_length;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
//
//        // Example 1
       String s1 = "abcabcbb";
       System.out.println(s1.substring(0, s1.length()));
        System.out.println("s1="+solution.lengthOfLongestSubstring(s1)); // Output: 3
//
//        // Example 2
//        String s2 = "bbbbb";
//        System.out.println(solution.lengthOfLongestSubstring(s2)); // Output: 1
//
//        // Example 3
//        String s3 = "pwwkew";
//        System.out.println(solution.lengthOfLongestSubstring(s3)); // Output: 3
        
    }
}
