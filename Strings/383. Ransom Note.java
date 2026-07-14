/*
Given two strings ransomNote and magazine, return true if ransomNote can be constructed by using the letters from magazine and false otherwise.

Each letter in magazine can only be used once in ransomNote.

 

Example 1:

Input: ransomNote = "a", magazine = "b"
Output: false
  */

class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        HashMap<Character,Integer> map = new HashMap<>();
        for(char ch : magazine.toCharArray()){
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        for(int i = 0;i<ransomNote.length();i++){
            char ch = ransomNote.charAt(i);
            if(map.getOrDefault(ch,0) == 0){
                return false;
            }
            map.put(ch,map.get(ch)-1); // decreasing the count of ch as we are using it for creating ransonNote
        }
        return true;
    }
}
