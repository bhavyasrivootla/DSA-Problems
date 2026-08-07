/*
You are given an absolute path for a Unix-style file system, which always begins with a slash '/'. Your task is to transform this absolute path into its simplified canonical path.

The rules of a Unix-style file system are as follows:

A single period '.' represents the current directory.
A double period '..' represents the previous/parent directory.
Multiple consecutive slashes such as '//' and '///' are treated as a single slash '/'.
Any sequence of periods that does not match the rules above should be treated as a valid directory or file name. For example, '...' and '....' are valid directory or file names.
The simplified canonical path should follow these rules:

The path must start with a single slash '/'.
Directories within the path must be separated by exactly one slash '/'.
The path must not end with a slash '/', unless it is the root directory.
The path must not have any single or double periods ('.' and '..') used to denote current or parent directories.
Return the simplified canonical path.

 

Example 1:

Input: path = "/home/"

Output: "/home"

Explanation:

The trailing slash should be removed.
  */

class Solution {
    public String simplifyPath(String path) {
        Stack<String> stack = new Stack<>();
        //split the path using /
        String[] parts = path.split("/");
        for(String part : parts){
            //Ignore . and empty parts
            if(part.equals("") || part.equals(".")){
                continue;
            }
            // .. means go back
            else if(part.equals("..")){
                if(!stack.isEmpty()){
                    stack.pop();
                }  
            }
            else{
                stack.push(part);
            }
        }
        StringBuilder result = new StringBuilder();
        for(String folder : stack){
            result.append("/").append(folder);
        }
        //If stack is empty
        if(result.length() == 0){
            return "/";
        }
        return result.toString();//convert the path back into string 
    }
}
