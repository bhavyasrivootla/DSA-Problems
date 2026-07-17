/*
Given a string s and an integer k, return the maximum number of vowel letters in any substring of s with length k.

Vowel letters in English are 'a', 'e', 'i', 'o', and 'u'.

 

Example 1:

Input: s = "abciiidef", k = 3
Output: 3
Explanation: The substring "iii" contains 3 vowel letters.
  */

class Solution {
    public int maxVowels(String s, int k) {
        int count = 0; //keep track of no of vowels
        int maxVowels = 0; //keep track of max vowels found 
        
        for(int i = 0;i<k;i++){ //count the vowels in first window
            char ch = s.charAt(i);
            if(ch == 'a'|| ch == 'e'|| ch == 'i'|| ch == 'o'|| ch == 'u'){
                count++;
            }
        }
        maxVowels = count;
        for(int i = k;i<s.length();i++){
            //remove the first character at left
            char left = s.charAt(i-k);
            if(left == 'a'||left == 'e' || left == 'i'|| left == 'o' || left == 'u'){
                count--;
            }
            char right = s.charAt(i);
            if(right == 'a'||right == 'e' || right== 'i'|| right == 'o' || right == 'u'){
                count++;
            }
            maxVowels = Math.max(maxVowels,count);
        }
        return maxVowels;
    }
}
