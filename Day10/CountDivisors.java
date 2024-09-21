import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;
class TestClass {
    public static void main(String args[] ) throws Exception {
        //BufferedReader
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        String str[]=s.split(" ");
        int count=0;
        int l = Integer.parseInt(str[0]);   
        int r = Integer.parseInt(str[1]);    
        int k = Integer.parseInt(str[2]);   
        for(int i=l;i<=r;i++)
        {
            if(i%k==0)
            {
                count++;
                i+=k;
                i--;
            }
        }        
        System.out.println(count);    // Writing output to STDOUT
    }
}
