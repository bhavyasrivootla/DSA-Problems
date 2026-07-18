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
        int count = 0;
        HashMap<Character,Integer> map = new HashMap<>();

        // Count the freq of all characters
        for(char ch : s.toCharArray()){
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        //To find out the highest freq char we need PriorityQueue
        PriorityQueue<Character> pq = new PriorityQueue<>((a,b) -> map.get(b) -map.get(a));

        pq.addAll(map.keySet());

        StringBuilder ans = new StringBuilder();
        while(!pq.isEmpty()){
            char ch = pq.poll(); //remove the char with highest freq from the priorityQueue
            int freq = map.get(ch); //find out the freq of removed char and store in freq
            while(freq-- > 0){
                ans.append(ch);
            }
        }
        return ans.toString();

    }
}
