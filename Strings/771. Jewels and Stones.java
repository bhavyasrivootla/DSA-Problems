/*
You're given strings jewels representing the types of stones that are jewels, and stones representing the stones you have. Each character in stones is a type of stone you have. You want to know how many of the stones you have are also jewels.

Letters are case sensitive, so "a" is considered a different type of stone from "A".

 

Example 1:

Input: jewels = "aA", stones = "aAAbbbb"
Output: 3
  */

class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        //add all jewels to set
        HashSet<Character> set = new HashSet<>();
        for(char ch : jewels.toCharArray()){
            set.add(ch);
        }
        //check each stone
        int count = 0;
        for(char ch : stones.toCharArray()){
            if(set.contains(ch)){
                count++;
            }
        }
        return count;
    }
}
