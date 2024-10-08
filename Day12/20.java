class Solution {
    public boolean isValid(String s) {
     char[] ch=s.toCharArray();   
     Stack<Character> stack = new Stack<Character>();
     for(char c:ch)
     {
       if(c=='(')
       {
        stack.push(')');
       }       
      else if(c=='[')
       {
        stack.push(']');
       }       
      else if(c=='{')
       {
        stack.push('}');
       }
      else if(stack.isEmpty() ||stack.pop()!=c)
       {
        return false;
       }
     }
        return stack.isEmpty();
    }
}
