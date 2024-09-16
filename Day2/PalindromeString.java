import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;
class TestClass {
    public static void main(String args[] ) throws Exception {
        //BufferedReader
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String name = br.readLine();                // Reading input from STDIN
        int i=0,j=name.length()-1,flag=1;
        while(i<j)
        {
           if(name.charAt(i)==name.charAt(j))
           {
            j--;
            i++;
           }
           else
           {
            flag=0;
            break;
           }
        }
        if(flag==1){
        System.out.println("YES");    // Writing output to STDOUT
        }
        else{
        System.out.println("NO");    // Writing output to STDOUT
        }
    }
}
