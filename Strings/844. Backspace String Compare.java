/*
Given two strings s and t, return true if they are equal when both are typed into empty text editors. '#' means a backspace character.

Note that after backspacing an empty text, the text will continue empty.

 

Example 1:

Input: s = "ab#c", t = "ad#c"
Output: true
Explanation: Both s and t become "ac".
Example 2:

Input: s = "ab##", t = "c#d#"
Output: true
Explanation: Both s and t become "".
Example 3:

Input: s = "a#c", t = "b"
Output: false
Explanation: s becomes "c" while t becomes "b".
  */

class Solution {
    public boolean backspaceCompare(String s, String t) {
        return build(s).equals(build(t));
    }
    //Helper method to process one string
    public String build(String str){
        Stack<Character> stack = new Stack<>();
        for(char ch : str.toCharArray()){
            if(ch == '#'){ //If char is #
                if(!stack.isEmpty()){
                    stack.pop();
                }
            }else{
                 stack.push(ch); //If the char is not '#'
            }
        }
        StringBuilder sb =  new StringBuilder();
        while(!stack.isEmpty()){
            sb.append(stack.pop());
        }
    return sb.reverse().toString();
    }
}
