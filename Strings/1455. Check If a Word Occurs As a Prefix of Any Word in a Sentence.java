/*
Given a sentence that consists of some words separated by a single space, and a searchWord, check if searchWord is a prefix of any word in sentence.

Return the index of the word in sentence (1-indexed) where searchWord is a prefix of this word. If searchWord is a prefix of more than one word, return the index of the first word (minimum index). If there is no such word return -1.

A prefix of a string s is any leading contiguous substring of s.

 

Example 1:

Input: sentence = "i love eating burger", searchWord = "burg"
Output: 4
Explanation: "burg" is prefix of "burger" which is the 4th word in the sentence.
  */


class Solution {
    public int isPrefixOfWord(String sentence, String searchWord) {
        String[] words = sentence.split(" "); //split the sentence into words
        for(int i = 0;i<words.length;i++){ //start with first word
            if(words[i].startsWith(searchWord)){ //check every word if it is equal to searchWord
                return i+1; //If yes then return the index + 1 bcoz acc to ques the index starts with 1
            }
        }
        return -1; //Else return -1
    }
}
