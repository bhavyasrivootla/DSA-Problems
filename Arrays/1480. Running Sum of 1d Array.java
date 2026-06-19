/*1480. Running Sum of 1d Array
Topic : Arrays

Input: nums = [1,2,3,4]
Output: [1,3,6,10]
Explanation: Running sum is obtained as follows: [1, 1+2, 1+2+3, 1+2+3+4].
*/

class Solution {
    public int[] runningSum(int[] nums) {
        int n = nums.length;
        int[] ans = new int[n];
        ans[0] = nums[0];
        for(int i = 1;i < n;i++){
            ans[i] = ans[i-1] + nums[i];
        }
        return ans;
    }
}
