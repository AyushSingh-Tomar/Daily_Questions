class Solution {
    public int minAddToMakeValid(String s){
     int l=0,r=0;
     for(int i=0;i<s.length();i++)
     {
        if(s.charAt(i)=='(')
        {
            l++;
        }
        else{
            if(l==0)
            {
                r++;
            }
            else
            {
                l--;
            }
        }
        
     }
     return r+l;
}
}
