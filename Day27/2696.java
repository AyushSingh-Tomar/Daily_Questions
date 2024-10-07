class Solution {
    public int minLength(String s) {
        s=" "+s+" ";
        int index=s.indexOf("AB");
        if(index==-1)
        {
          index=s.indexOf("CD");
        }

        while(index!=-1){
          s=s.substring(0,index)+s.substring(index+2,s.length());
          index= s.indexOf("AB");
          if(index==-1)
          {
            index=s.indexOf("CD");
          }
          System.out.println(s);
        }
        return s.length()-2;
    }
}
