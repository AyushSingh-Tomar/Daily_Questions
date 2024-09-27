import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;
class TestClass {
    public static void main(String args[] ) throws Exception {
        //BufferedReader
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String n = br.readLine();
        char ch[]=n.toCharArray();
        String ans="";
        for(int i=0;i<ch.length;i++)
        {
            if(ch[i]>=97)
            {
                ch[i]-=32;
            }
            else
            {
                ch[i]+=32;
            }
            ans+=String.valueOf(ch[i]);
        }
        System.out.println(ans);
    }
}
