/*
Given a string s, reverse the string according to the following rules:

All the characters that are not English letters remain in the same position.
All the English letters (lowercase or uppercase) should be reversed.
Return s after reversing it.

 

Example 1:

Input: s = "ab-cd"
Output: "dc-ba"
  */

class Solution {
    public String reverseOnlyLetters(String s) {
        int left = 0;
        int right = s.length()-1;
        char[] ch = s.toCharArray();
        while(left<right){
            if(!Character.isLetter(ch[left])){ //If it is not a letter then move left 
                left++;
            }
            else if(!Character.isLetter(ch[right])){ //If it is not a letter move right
                right--;
            }
            else{
                char temp = ch[left];
                ch[left] = ch[right];
                ch[right] = temp;

                left++;
                right--;
            }
           
        }
        return new String(ch);
    }
}
