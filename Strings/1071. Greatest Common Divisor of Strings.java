/*
For two strings s and t, we say "t divides s" if and only if s = t + t + t + ... + t + t (i.e., t is concatenated with itself one or more times).

Given two strings str1 and str2, return the largest string x such that x divides both str1 and str2.

 

Example 1:

Input: str1 = "ABCABC", str2 = "ABC"

Output: "ABC"
  */

class Solution {
    public String gcdOfStrings(String str1, String str2) {
        int minLength = Math.min(str1.length(),str2.length());
        for(int len = minLength;len>=1;len--){ //decreases the length and checks
            String candidate = str1.substring(0,len);//stores the string according to the len
            if(!str1.startsWith(candidate) || !str2.startsWith(candidate)){
                continue;
            }
            if(canBuild(str1,candidate) && canBuild(str2,candidate)){
                return candidate;
            }
        }
        return "";
    }
    
    public boolean canBuild(String str,String candidate){
        StringBuilder sb = new StringBuilder();
        while(sb.length() < str.length()){
            sb.append(candidate);
        }
        return sb.toString().equals(str); //checks whether the candidate is equal to str 
    }
    
}
