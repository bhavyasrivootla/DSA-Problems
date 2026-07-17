/*
Given a string s, find the length of the longest substring without duplicate characters.

 

Example 1:

Input: s = "abcabcbb"
Output: 3
Explanation: The answer is "abc", with the length of 3. Note that "bca" and "cab" are also correct answers.
Example 2:

Input: s = "bbbbb"
Output: 1
Explanation: The answer is "b", with the length of 1.
  */

class Solution {
    public int lengthOfLongestSubstring(String s) {
        int left = 0;
        int maxLength = 0;
        HashMap<Character,Integer> map = new HashMap<>();
        for(int right = 0;right<s.length();right++){
            //Expand the window 
            char ch = s.charAt(right);
            map.put(ch,map.getOrDefault(ch,0)+1);
            //Shrink the window
            while(map.get(ch)>1){
                char leftChar = s.charAt(left);
                // Updating the hashmap by decreasing the value of lefChar
                map.put(leftChar,map.get(leftChar)-1);

                left++;
            }
            maxLength = Math.max(maxLength,right-left+1);

        }
        return maxLength;
    }
}
