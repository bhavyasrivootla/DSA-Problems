// LeetCode 1: Two Sum
// Approach: Brute Force
// Time Complexity: O(n^2)
// Space Complexity: O(1)

class Solution {
    public int[] twoSum(int[] nums, int target) {

        // Loop through all pairs
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {

                // Check if pair sum equals target
                if (nums[i] + nums[j] == target) {
                    return new int[] { i, j };
                }
            }
        }

        // If no solution found
        return new int[] {};
    }
}
