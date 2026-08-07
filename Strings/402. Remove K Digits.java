/*
Given string num representing a non-negative integer num, and an integer k, return the smallest possible integer after removing k digits from num.

 

Example 1:

Input: num = "1432219", k = 3
Output: "1219"
Explanation: Remove the three digits 4, 3, and 2 to form the new number 1219 which is the smallest.
Example 2:

Input: num = "10200", k = 1
Output: "200"
Explanation: Remove the leading 1 and the number is 200. Note that the output must not contain leading zeroes.
  */

class Solution {
    public String removeKdigits(String num, int k) {
        Stack<Integer> stack = new Stack<>();
        for(int i = 0;i<num.length();i++){
            int current = num.charAt(i) - '0';
            //if top > current
            while(k > 0 && !stack.isEmpty() && stack.peek() > current){
                stack.pop();
                k--;
            }
            stack.push(current);    
        }
        //when top < current and stack is not empty remove digits from the end if k > 0
        while(k > 0 && !stack.isEmpty()){
            stack.pop();
            k--;
        }
        //remove leading zeroes 
        StringBuilder result = new StringBuilder();
        for(int digit : stack){
            result.append(digit);   
        }
       
        int i = 0;
        while(i < result.length() && result.charAt(i) == '0'){
            i++;
        }
        //if everything is removed,only zeroes remain 
        if(i == result.length()){
            return "0";
        }
        return result.substring(i);
    }
}
