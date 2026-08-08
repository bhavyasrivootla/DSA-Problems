/*
Given a string s, sort it in decreasing order based on the frequency of the characters. The frequency of a character is the number of times it appears in the string.

Return the sorted string. If there are multiple answers, return any of them.

 

Example 1:

Input: s = "tree"
Output: "eert"
Explanation: 'e' appears twice while 'r' and 't' both appear once.
So 'e' must appear before both 'r' and 't'. Therefore "eetr" is also a valid answer.
  */

class Solution {
    public String frequencySort(String s) {
        HashMap<Character,Integer> map = new HashMap<>();
        for(char ch : s.toCharArray()){
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        PriorityQueue<Character> pq = new PriorityQueue<>(
            (a,b) -> map.get(b) - map.get(a)
        );
        //Add all characters
        for(char ch : map.keySet()){
            pq.offer(ch);
        }
        StringBuilder result = new StringBuilder();
        while(!pq.isEmpty()){
            char ch = pq.poll();
            int count = map.get(ch);
            for(int i = 0;i<count;i++){
                result.append(ch);
            }
        }
        return result.toString();
    }
}
