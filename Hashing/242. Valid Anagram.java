/*
Given two strings s and t, return true if t is an anagram of s, and false otherwise.

 

Example 1:

Input: s = "anagram", t = "nagaram"

Output: true
  */

class Solution {
    public boolean isAnagram(String s, String t) {
        HashMap<Character,Integer> map = new HashMap<>();
        if(s.length() != t.length()){
            return false;
        }
        for(char ch : s.toCharArray()){
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        for(char ch : t.toCharArray()){
                if(!map.containsKey(ch)){
                    return false;
                }
                map.put(ch,map.get(ch)-1);  
                if(map.get(ch)<0){
                    return false;
                } 
        }
        return true;
    }
}
