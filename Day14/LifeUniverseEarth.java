import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;
class TestClass {
    public static void main(String args[] ) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int flag=1;
        while(flag ==1)
        {
          int n=Integer.parseInt(br.readLine());
          if(n==42)
          {
            flag=0;
          }
          else
          {
            System.out.println(n);
          }
        }

    }
}
// 