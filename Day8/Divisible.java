import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;
class TestClass {
    public static void main(String args[] ) throws Exception {
        //BufferedReader
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String s = br.readLine();
        if(s.charAt(s.length()-1)=='0'){
            System.out.println("Yes");
        }
        else
        {
            System.out.println("No");
        }
    }
}
